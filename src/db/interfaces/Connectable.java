package db.interfaces;

import java.util.ArrayList;

import db.utils.Column;

public abstract class Connectable {
	private String host;
	private String user;
	private String password;
	private String database;

	private int defaultVarcharLength = 40;

	public Connectable(String host, String user, String password, String database) {
		this.host = host;
		this.user = user;
		this.password = password;
		this.database = database;
	}

	public abstract String getConnectionString();

	public abstract String getIntegerKeyword();

	public abstract String getVarcharKeyword();

	public abstract String getBooleanKeyword();
	
	protected abstract String getCreateTableQuery();

	protected abstract String getCreateColumnsQuery();
	
	public String getDefaultVarcharLength() {
		return Integer.toString(this.defaultVarcharLength);
	}

	public String getHost() {
		return host;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getDatabase() {
		return database;
	}

	public void setDefaultVarcharLength(int length) {
		this.defaultVarcharLength = length;
	}
	
	public String getCreateDbStatement(String tableName, ArrayList<Column<?>> columns, boolean allowNulls) {
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

	protected String getColumnTypeAsString(Class<?> cls) {
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
	
	protected static String allowNulls(boolean allowNulls) {
		if (allowNulls == true) {
			return "Null";
		} else {
			return "Not Null";
		}
	}
}
