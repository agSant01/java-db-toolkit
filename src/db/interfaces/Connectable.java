package db.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import db.utils.Column;

/**
 * Abstract class to represent any database engine. Stores key attributes for the proper functionality of a DB engine
 * 
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 */
public abstract class Connectable {
	private String host;
	private String user;
	private String password;
	private String database;
	
	// default length for any String object
	private int defaultVarcharLength = 40;

	/**
	 * Creates a Connectable instance
	 *
	 * @author Gabriel S. Santiago
	 * @param host
	 * @param user
	 * @param password
	 * @param database
	 */
	public Connectable(String host, String user, String password, String database) {
		this.host = host;
		this.user = user;
		this.password = password;
		this.database = database;
	}
 
	/**
	 * @return the connection string
	 */
	public abstract String getConnectionString();
	
	/**
	 * Returns the SQL connection object
	 *
	 * @return connection
	 * @throws SQLException
	 */
	public Connection getNewConnection() throws SQLException {
		return DriverManager.getConnection(this.getConnectionString());
	};
	
	/**
	 * @return the integer keyword for the engine
	 */
	public abstract String getIntegerKeyword();

	/**
	 * @return the string keyword for the engine
	 */
	public abstract String getVarcharKeyword();

	/**
	 * @return the boolean keyword for the engine
	 */
	public abstract String getBooleanKeyword();

	/**
	 * @return the create table default statement for the engine
	 */
	protected abstract String getCreateTableQuery();

	/**
	 * @return the create column default statement for the engine
	 */
	protected abstract String getCreateColumnsQuery();

	/**
	 * @return the default length for any String object
	 */
	public final String getDefaultVarcharLength() {
		return Integer.toString(this.defaultVarcharLength);
	}

	/**
	 * @return the host
	 */
	public final String getHost() {
		return host;
	}
	
	/**
	 * @return the user
	 */
	public final String getUser() {
		return user;
	}

	/**
	 * @return the user
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @return the user
	 */
	public final String getDatabase() {
		return database;
	}

	/**
	 * @return the user
	 */
	public final void setDefaultVarcharLength(int length) {
		this.defaultVarcharLength = length;
	}
	
	
	/**
	 * Generate the create statement for the creation of a table in a Database based on the model object getter definitions.
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param tableName
	 * @param columns
	 * @param allowNulls
	 * @return
	 */
	public final String getCreateTableStatement(String tableName, ArrayList<Column<?>> columns, boolean allowNulls) {
		String createTableQuery = String.format(this.getCreateTableQuery(), tableName);
		
		ArrayList<String> createColumnsQueryParts = new ArrayList<>();
		
		for (Column<?> column : columns) {
			String str = String.format(
					this.getCreateColumnsQuery(), 
					column.getColumnName(),
					this.getColumnTypeAsString(column.getType()),
					allowNulls(allowNulls)
			);
			createColumnsQueryParts.add(str);
		}
		
		String createColumnsQuery = String.join(", ", createColumnsQueryParts);
		
		createTableQuery += createColumnsQuery + ");";
		
		return createTableQuery;
	}

	/**
	 * Get the DB data type keyword according to the data type of the the model property
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param cls
	 * @return
	 */
	protected final String getColumnTypeAsString(Class<?> cls) {
		if (cls == int.class) {
			return this.getIntegerKeyword();
		} else if (cls == double.class) {
			return this.getIntegerKeyword();
		} else if(cls == boolean.class) {
			return this.getBooleanKeyword();
		}  else {
			return getVarcharKeyword() + "(" + this.getDefaultVarcharLength() + ")";
		}
	}
	
	/**
	 * Gets the String representation for allowing NULLS in the table the columns
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @param allowNulls
	 * @return
	 */
	protected final static String allowNulls(boolean allowNulls) {
		if (allowNulls == true) {
			return "Null";
		} else {
			return "Not Null";
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String toString() {
		return String.format("{"
				+ "'Properties': {"
				+ "'Host':'%s', "
				+ "'User':'%s', "
				+ "'Password':'%s', "
				+ "'Database': '%s'"
				+ "},"
				+ "Config: {"
				+ "'Integer': '%s', "
				+ "'Varchar': '%s', "
				+ "'VarcharLength': '%s',"
				+ "'Boolean': '%s'"
				+ "},"
				+ "'Statements': {"
				+ "'CreateTable': '%s',"
				+ "'CreateColumn: '%s'"
				+ "},"
				+ "'ConnectionString': '%s'"
				+ "}",
					this.getHost(),
					this.getUser(),
					this.getPassword(),
					this.getDatabase(),
					this.getIntegerKeyword(),
					this.getVarcharKeyword(),
					this.getDefaultVarcharLength(),
					this.getBooleanKeyword(),
					this.getCreateTableQuery(),
					this.getCreateColumnsQuery(),
					this.getConnectionString()
				);
	}
}
