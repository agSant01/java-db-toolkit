package db.engines;

import db.interfaces.Connectable;

public class MySQL extends Connectable {
	private static final String CREATE_TABLE_QUERY = "Create Table If Not Exists %s (";	// table name
	private static final String CREATE_COLUMNS_QUERY = "%s %s %s";						// columnName	type	isNull
	
	/**
	 * Creates a MySQL instance
	 *
	 * @author Gabriel S. Santiago
	 * @param host
	 * @param user
	 * @param password
	 * @param database
	 */
	public MySQL(String host, String user, String password, String database) {
		super(host, user, password, database);
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getConnectionString()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getConnectionString() {
		return "";
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getIntegerKeyword()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getIntegerKeyword() {
		return "Integer";
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getVarcharKeyword()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getVarcharKeyword() {
		return "Varchar";
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getBooleanKeyword()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getBooleanKeyword() {
		return "Boolean";
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getTimeStampKeyword()
	 * @date Dec 4, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getTimeStampKeyword() {
		return "Timestamp";
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getCreateTableQuery()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	protected String getCreateTableQuery() {
		return CREATE_TABLE_QUERY;
	}

	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getCreateColumnsQuery()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	protected String getCreateColumnsQuery() {
		return CREATE_COLUMNS_QUERY;
	}
}
