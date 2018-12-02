package db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import db.interfaces.Connectable;
import db.interfaces.Relational;
import db.utils.Column;


/**
 * @author Gabriel S. Santiago
 * 
 * Core functionality. Manager of actions against the DB. Insert, Select, Delete, etc.
 */
public class DbConHandler {
	// DB connection object
	private Connection dbConnection;

	// stores data related to the engine being used.
	private Connectable connectable;

	// flag for creating tables in DB init
	private boolean allowNulls = false;

	/**
	 * Creates a DBConHanlder instance.
	 * 
	 * @param connectable
	 * @throws SQLException
	 */
	public DbConHandler(Connectable connectable) throws SQLException {
		this.connectable = connectable;
		this.dbConnection = this.connectable.getNewConnection();
	}

	/**
	 * @return the connectable
	 */
	public Connection getConnection() {
		return dbConnection;
	}

	/**
	 * Executes an Insert, Update, or Delete query.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param query
	 * @throws SQLException
	 */
	public void execute(String query) throws SQLException {
		Statement stmt = this.dbConnection.createStatement();

		stmt.executeQuery(query);

		stmt.close();
		stmt = null;
	}

	/**
	 * Inserts a Relational object into the database.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param object
	 * @return
	 * @throws SQLException
	 */
	public boolean insert(Relational object) throws SQLException {
		String query = getRelationalInsertQuery(object);

		PreparedStatement stmt = this.getPreparedStatement(query);

		DbConHandler.setStatemtentData(stmt, object.getParsedSchema());

		boolean result = stmt.execute();

		stmt.close();
		stmt = null;

		return result;
	}

	/**
	 * Inserts a list of Relational objects to the database.
	 * The Relational objects does not need to be the same type.
	 * An individual query will be generated and executed for each object in the list. This will include significant overhead.
	 * For lists with the same type of object use the `insert()` method.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param objects
	 * @return
	 * @throws SQLException
	 */
	public boolean[] insertIndividual(ArrayList<Relational> objects) throws SQLException {
		// statement object
		// sanitizes the query to not include possible SQL Injection attacks
		PreparedStatement stmt = null;
		String query;

		boolean[] result = new boolean[objects.size()];
		// object counter
		int iter = 0;

		for (Relational object : objects) {
			query = getRelationalInsertQuery(object);
			if (iter == 0) {
				stmt = this.getPreparedStatement(query);
			} else {
				stmt.addBatch(query);
			}

			DbConHandler.setStatemtentData(stmt, object.getParsedSchema());

			result[iter++] = stmt.execute();			
		}
		stmt.close();
		stmt = null;
		return result;
	}

	/**
	 * Inserts a list of Relational obectes to the database in a single 
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param objects
	 * @return
	 * @throws SQLException
	 */
	public boolean insertTransaction(ArrayList<Relational> objects) throws SQLException {
		PreparedStatement stmt;
		String query;
		boolean result;

		query = DbConHandler.getRelationalInsertQuery(objects.get(0));

		stmt = this.getPreparedStatement(query);

		for (Relational object : objects) {
			DbConHandler.setStatemtentData(stmt, object.getParsedSchema());
			stmt.addBatch();
		}
		result = stmt.execute();
		stmt.close();
		stmt = null;

		return result;
	}

	/**
	 * Executes a Select statement
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 2, 2018
	 * @param query
	 * @return result set
	 * @throws SQLException
	 */
	public ResultSet query(String query) throws SQLException {
		Statement stmt = this.dbConnection.createStatement();

		stmt.executeQuery(query);

		return stmt.getResultSet();
	}

	public PreparedStatement getPreparedStatement(String query) throws SQLException {
		PreparedStatement stmt = this.dbConnection.prepareStatement(query);		
		return stmt;
	}

	/**
	 * @param allowNulls the allowNulls to set
	 */
	public void setInitAllowNulls(boolean allowNulls) {
		this.allowNulls = allowNulls;
	}


	/**
	 * Creates tables in the database according to the model object schemas if they does not exists.
	 * Argument is a class or list of classes.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 2, 2018
	 * @param clss class or classes
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws SQLException
	 */
	@SafeVarargs
	public final void initTables(Class<? extends Relational>...clss) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if (clss.length == 1) {
			// only one class to Init
			ArrayList<Column<?>> columns = new ArrayList<>();
			
			// get the public getters 
			for (Method method : clss[0].getDeclaredMethods()) {
				if (Modifier.isPublic(method.getModifiers())
						&& method.getParameterTypes().length == 0
						&& method.getReturnType() != void.class
						&& method.getName().startsWith("get")
						&& !method.getName().equals("getTableName")
						) {
					columns.add(new Column<>(method.getName().replaceAll("get", ""), method.getReturnType()));
				}
			}
			columns.sort(Column.descendingColumnName());
			String createTableQuery = this.connectable.getCreateTableStatement(clss[0].getConstructor().newInstance().getTableName(), columns, this.allowNulls);
			this.execute(createTableQuery);	
		} else {
			Statement stmt = this.dbConnection.createStatement();
			for (Class<? extends Relational> cls : clss) {
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
				columns.sort(Column.descendingColumnName());
				String createTableQuery = this.connectable.getCreateTableStatement(cls.getConstructor().newInstance().getTableName(), columns, this.allowNulls);
				stmt.addBatch(createTableQuery);
			}
			stmt.executeBatch();
			stmt.close();
		}
	}

	/**
	 * Adds the parameters with their corresponding types to the PreparedStatement.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 2, 2018
	 * @param stmt
	 * @param schema
	 * @throws SQLException
	 */
	private static void setStatemtentData(PreparedStatement stmt, ArrayList<Column<?>> schema) throws SQLException {
		for (int position = 1; position <= schema.size(); position++) {
			Column<?> column = schema.get(position-1);
			if (column.getType() == int.class) {
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

	/**
	 * Parses the model object and creates an insert query for the object 
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 2, 2018
	 * @param object
	 * @return
	 */
	private static String getRelationalInsertQuery(Relational object) {
		// amount of values
		List<String> values = new LinkedList<>();
		// list of the names of the columns
		List<String> columnNames = new LinkedList<>();

		// iterate over the object fields represented in Columns
		for (Column<?> column : object.getParsedSchema()) {
			columnNames.add(column.getColumnName()) ;
			values.add("?");
		}
		
		// format string
		return String.format("INSTER INTO %s(%s) VALUES('%s')", object.getTableName(), String.join(", ", columnNames), String.join(", ", values));
	}
}
