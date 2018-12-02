/**
 * DbAPI.tests.driver
 * Connection.java
 * @date Dec 1, 2018
 * @author Gabriel S. Santiago
 */
package tests.drivers;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import tests.utils.Debuger;

/**
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 */
public class TestConnection extends Debuger implements Connection {
	
	private String lastMethodExecuted;
	private TestPreparedStatement pstmt;
	private TestStatement stmt;
	
	private void setLastMethodExecuted() {
		this.lastMethodExecuted = Thread.currentThread().getStackTrace()[2].getMethodName() + "()";
	}
	
	/**
	 * @return the lastMethodExecuted
	 */
	public String getLastMethodExecuted() {
		return lastMethodExecuted;
	}

	/**
	 * @return the pstmt
	 */
	public TestPreparedStatement getPstmt() {
		return pstmt;
	}

	/**
	 * @return the stmt
	 */
	public TestStatement getStmt() {
		return stmt;
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
	 * @see java.sql.Connection#abort(java.util.concurrent.Executor)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void abort(Executor arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#clearWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearWarnings() throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#close()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void close() throws SQLException {
		info("Connection closed");
		setLastMethodExecuted();
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#commit()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void commit() throws SQLException {
		info("Commited");
		setLastMethodExecuted();		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createArrayOf(java.lang.String, java.lang.Object[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Array createArrayOf(String arg0, Object[] arg1) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createBlob()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Blob createBlob() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createClob()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Clob createClob() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createNClob()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public NClob createNClob() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createSQLXML()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLXML createSQLXML() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Statement createStatement() throws SQLException {
		setLastMethodExecuted();
		this.stmt = new TestStatement(this);
		return this.stmt;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Statement createStatement(int arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Statement createStatement(int arg0, int arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStruct(java.lang.String, java.lang.Object[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Struct createStruct(String arg0, Object[] arg1) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getAutoCommit()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean getAutoCommit() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getCatalog()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getCatalog() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Properties getClientInfo() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getClientInfo(String arg0) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getHoldability()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getHoldability() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getMetaData()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getNetworkTimeout()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getNetworkTimeout() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getSchema()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getSchema() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTransactionIsolation()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getTransactionIsolation() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTypeMap()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isClosed()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isReadOnly()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isReadOnly() throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isValid(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isValid(int arg0) throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#nativeSQL(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String nativeSQL(String arg0) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public CallableStatement prepareCall(String arg0) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public CallableStatement prepareCall(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0) throws SQLException {
		setLastMethodExecuted();
		this.pstmt = new TestPreparedStatement(this, arg0);
		return this.pstmt;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0, int[] arg1) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, java.lang.String[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0, String[] arg1) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public PreparedStatement prepareStatement(String arg0, int arg1, int arg2, int arg3) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#releaseSavepoint(java.sql.Savepoint)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void releaseSavepoint(Savepoint arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void rollback() throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void rollback(Savepoint arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setAutoCommit(boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setAutoCommit(boolean arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setCatalog(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setCatalog(String arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.util.Properties)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setClientInfo(Properties arg0) throws SQLClientInfoException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.lang.String, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setHoldability(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setHoldability(int arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setNetworkTimeout(java.util.concurrent.Executor, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setReadOnly(boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setReadOnly(boolean arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Savepoint setSavepoint() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Savepoint setSavepoint(String arg0) throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSchema(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setSchema(String arg0) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTransactionIsolation(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTransactionIsolation(int arg0) throws SQLException {
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTypeMap(java.util.Map)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException {
		
	}

}
