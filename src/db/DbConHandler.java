package db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.interfaces.Connectable;
import db.interfaces.Relational;
import db.utils.Column;

public class DbConHandler {
	private Connection dbConnection;
	private Connectable connectable;
	
	public DbConHandler(Connectable connectable) throws SQLException {
		this.connectable = connectable;
		this.dbConnection = DriverManager.getConnection(this.connectable.getConnectionString());
	}
	
	public void execute(String query) throws SQLException {
		Statement stmt = this.dbConnection.createStatement();
		
		stmt.executeQuery(query);
		
		stmt.close();
		stmt = null;
	}
	
	public boolean insert(Relational object) throws SQLException {
		String query = getRelationalInsertQuery(object);
		
		PreparedStatement stmt = this.getPreparedStatement(query);
		
		DbConHandler.setStatemtentData(stmt, object.getSchema());
		
		boolean result = stmt.execute();
		
		stmt.close();
		stmt = null;
		
		return result;
	}
	
	public boolean[] insertIndividual(ArrayList<Relational> objects) throws SQLException {
		
		PreparedStatement stmt;
		String query;
		boolean[] result = new boolean[objects.size()];
		int iter = 0;
		
		for (Relational object : objects) {
			query = getRelationalInsertQuery(object);
			stmt = this.getPreparedStatement(query);
			
			DbConHandler.setStatemtentData(stmt, object.getSchema());
			
			result[iter++] = stmt.execute();
			
			stmt.close();
			stmt = null;
			
		}
		return result;
	}
	
	public boolean insertTransaction(ArrayList<Relational> objects) throws SQLException {
		PreparedStatement stmt;
		String query;
		boolean result;
		
		query = getRelationalInsertQuery(objects.get(0));
		
		stmt = this.getPreparedStatement(query);
		
		for (Relational object : objects) {
			DbConHandler.setStatemtentData(stmt, object.getSchema());
			stmt.addBatch();
		}
		result = stmt.execute();
		stmt.close();
		stmt = null;
		
		return result;
	}

	public ResultSet query(String query) throws SQLException {
		Statement stmt = this.dbConnection.createStatement();
		
		stmt.executeQuery(query);
				
		return stmt.getResultSet();
	}
	
	public PreparedStatement getPreparedStatement(String query) throws SQLException {
		PreparedStatement stmt = this.dbConnection.prepareStatement(query);		
		return stmt;
	}
	
	public void init(ArrayList<Class<? extends Relational>> clss, boolean allowNulls) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		for (Class<? extends Relational> cls : clss)
			init(cls, allowNulls);
	}
	
	public void init(Class<? extends Relational> cls, boolean allowNulls) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ArrayList<Column<?>> columns = new ArrayList<>();
		for (Method method : cls.getDeclaredMethods()) {
		    if (Modifier.isPublic(method.getModifiers())
		        && method.getParameterTypes().length == 0
		        && method.getReturnType() != void.class
		        && method.getName().startsWith("get")
		        && !method.getName().equals("getTableName")
		    ) {
		    	columns.add(new Column<>(method.getName().replaceAll("get", ""), method.getReturnType()));
		    }
		}
		
		String s = this.connectable.getCreateDbStatement(cls.getConstructor().newInstance().getTableName(), columns, allowNulls);
		
		System.out.println(s);
	}

	private static void setStatemtentData(PreparedStatement stmt, ArrayList<Column<?>> schema) throws SQLException {
		for (int position = 1; position <= schema.size(); position++) {
			Column<?> column = schema.get(position);
			if (column.getType() == int .class) {
				stmt.setInt(position, (int) column.getValue());	
			} else  if(column.getType() == double.class) {
				stmt.setDouble(position, (double) column.getValue());	
			} else if (column.getType() == boolean.class) {
				stmt.setBoolean(position, (boolean) column.getValue());	
			} else {
				stmt.setString(position, column.getValue().toString());				
			}
		}
	}
	
	private static String getRelationalInsertQuery(Relational object) {
		String values = "";
		String columnNames = "";
		
		for (int i = 0; i < object.getSchema().size(); i++) {
			columnNames += object.getSchema().get(i).getColumnName();
			values += "?";
		}
		
		return String.format("INSTER INTO %s(%s) VALUES('%s')", object.getTableName(), columnNames, values);
	}
}
