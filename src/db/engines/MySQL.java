package db.engines;

import db.interfaces.Connectable;

public class MySQL extends Connectable {
	private static final String CREATE_TABLE_QUERY = "Create Table If Not Exists %s (";	// table name
	private static final String CREATE_COLUMNS_QUERY = "%s %s %s";						// columnName	type	isNull
	
	public MySQL(String host, String user, String password, String database) {
		super(host, user, password, database);
	}

	@Override
	public String getConnectionString() {
		return "";
	}

	@Override
	public String getIntegerKeyword() {
		return "Integer";
	}

	@Override
	public String getVarcharKeyword() {
		return "Varchar";
	}

	@Override
	public String getBooleanKeyword() {
		return "Boolean";
	}

	@Override
	protected String getCreateTableQuery() {
		return CREATE_TABLE_QUERY;
	}

	@Override
	protected String getCreateColumnsQuery() {
		return CREATE_COLUMNS_QUERY;
	}
}
