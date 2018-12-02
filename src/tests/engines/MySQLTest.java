/**
 * DbAPI.tests
 * MySQLTest.java
 * @date Dec 2, 2018
 * @author Gabriel S. Santiago
 */
package tests.engines;

import java.sql.Connection;
import java.sql.SQLException;

import db.engines.MySQL;
import tests.drivers.TestConnection;

/**
 * @author Gabriel S. Santiago
 * @date Dec 2, 2018
 *
 */
public class MySQLTest extends MySQL {

	/**
	 * Creates a {} instance
	 *
	 * @author Gabriel S. Santiago
	 * @param host
	 * @param user
	 * @param password
	 * @param database
	 */
	public MySQLTest(String host, String user, String password, String database) {
		super(host, user, password, database);
	}
	
	/* (non-Javadoc)
	 * @see db.interfaces.Connectable#getConnection()
	 * @date Dec 2, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Connection getNewConnection() throws SQLException {
		return new TestConnection();
	}
}
