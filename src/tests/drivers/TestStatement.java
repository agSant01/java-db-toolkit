/**
 * DbAPI.tests.driver
 * TestStatement.java
 * @date Dec 1, 2018
 * @author Gabriel S. Santiago
 */
package tests.drivers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.ArrayList;

import tests.utils.Debuger;

/**
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 */
public class TestStatement extends Debuger implements Statement {
	private ArrayList<String> queryBatch = new ArrayList<>();
	private ArrayList<String> lastQueryBatch;
	
	private String lastExecutedQuery;

	private Connection connection;
	private String lastMethodExecuted;

	/**
	 * Creates a TestPreparedStatement instance
	 *
	 * @author Gabriel S. Santiago
	 */
	public TestStatement(Connection connection) {
		this.connection = connection;
	}
	
	public String lastExecuted() {
		return this.lastMethodExecuted;
	}

	private void setLastMethodExecuted() {
		this.lastMethodExecuted = Thread.currentThread().getStackTrace()[2].getMethodName() + "()";
	}

	public String getLastQuery() {
		return lastExecutedQuery;
	}
	
	public ArrayList<String> getLastBatch() {
		return lastQueryBatch;
	}
	
	/* (non-Javadoc)
	 * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Wrapper#unwrap(java.lang.Class)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#addBatch(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void addBatch(String arg0) throws SQLException {
		info("Add batch");
		this.queryBatch.add(arg0);
		setLastMethodExecuted();
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#cancel()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void cancel() throws SQLException {
		info("Cancel");
		setLastMethodExecuted();
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#clearBatch()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearBatch() throws SQLException {
		info("Clear batch");
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#clearWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearWarnings() throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#close()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void close() throws SQLException {
		info("Close");
		setLastMethodExecuted();		
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#closeOnCompletion()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void closeOnCompletion() throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0) throws SQLException {
		info("Query executed");
		this.lastExecutedQuery = arg0;
		setLastMethodExecuted();
		return true;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0, int arg1) throws SQLException {
		info("Query executed");
		this.lastExecutedQuery = arg0;
		setLastMethodExecuted();
		return true;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String, int[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		info("Query");
		this.lastExecutedQuery = arg0;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String, java.lang.String[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		info("Query executed");
		this.lastExecutedQuery = arg0;
		setLastMethodExecuted();
		return true;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeBatch()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int[] executeBatch() throws SQLException {
		info("Batch Executed");
		this.lastQueryBatch = this.queryBatch;
		this.clearBatch();
		setLastMethodExecuted();
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeQuery(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSet executeQuery(String arg0) throws SQLException {
		info("Query executed");
		this.lastExecutedQuery = arg0;
		setLastMethodExecuted();
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeUpdate(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int executeUpdate(String arg0) throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int executeUpdate(String arg0, int arg1) throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeUpdate(java.lang.String, int[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int executeUpdate(String arg0, int[] arg1) throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeUpdate(java.lang.String, java.lang.String[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int executeUpdate(String arg0, String[] arg1) throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getConnection()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Connection getConnection() throws SQLException {
		return this.connection;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getFetchDirection()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getFetchDirection() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getFetchSize()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getFetchSize() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getGeneratedKeys()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getMaxFieldSize()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getMaxFieldSize() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getMaxRows()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getMaxRows() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getMoreResults()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean getMoreResults() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getMoreResults(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean getMoreResults(int arg0) throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getQueryTimeout()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getQueryTimeout() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getResultSet()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSet getResultSet() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getResultSetConcurrency()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getResultSetConcurrency() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getResultSetHoldability()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getResultSetHoldability() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getResultSetType()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getResultSetType() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getUpdateCount()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getUpdateCount() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#getWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#isCloseOnCompletion()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#isClosed()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#isPoolable()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isPoolable() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setCursorName(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setCursorName(String arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setEscapeProcessing(boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setEscapeProcessing(boolean arg0) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setFetchDirection(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setFetchDirection(int arg0) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setFetchSize(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setFetchSize(int arg0) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setMaxFieldSize(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setMaxFieldSize(int arg0) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setMaxRows(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setMaxRows(int arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setPoolable(boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setPoolable(boolean arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#setQueryTimeout(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setQueryTimeout(int arg0) throws SQLException {
		
	}

}
