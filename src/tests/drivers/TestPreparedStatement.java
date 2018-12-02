/**
 * DbAPI.tests.driver
 * TestPreparedStatement.java
 * @date Dec 1, 2018
 * @author Gabriel S. Santiago
 */
package tests.drivers;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import tests.utils.Debuger;

/**
 * @author Gabriel S. Sant
import tests.Debuger;iago
 * @date Dec 1, 2018
 *
 */
public class TestPreparedStatement extends Debuger implements PreparedStatement {
	private ArrayList<String> queryBatchList = new ArrayList<>();
	private String lastExecutedQuery;
	private ArrayList<String> lastExecutedBatch;
	private String query;

	private HashMap<Integer, Object> params = new HashMap<>();

	private Connection connection;
	private String lastMethodExecuted;

	/**
	 * Creates a TestPreparedStatement instance
	 *
	 * @author Gabriel S. Santiago
	 */
	public TestPreparedStatement(Connection con, String query) {
		this.connection = con;
		this.query = query;
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
		return lastExecutedBatch;
	}
	
	private int countParams(String string) {
		int counter = 0;
		while(true) {
			if (string.contains("?")) {
				string = string.replaceFirst("\\?", "");
				counter++;
			}
			else
				break;
		}
		return counter;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#addBatch(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void addBatch(String arg0) throws SQLException {
		this.queryBatchList.add(arg0);
		setLastMethodExecuted();
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#cancel()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void cancel() throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#clearBatch()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearBatch() throws SQLException {
		this.queryBatchList.clear();
		setLastMethodExecuted();
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
		info("Prepared Statement Closed");
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
		info("Executed");
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
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String, int[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0, int[] arg1) throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#execute(java.lang.String, java.lang.String[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute(String arg0, String[] arg1) throws SQLException {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Statement#executeBatch()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int[] executeBatch() throws SQLException {
		info("Executed Batch");
		this.lastExecutedBatch = queryBatchList;
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
	 * @see java.sql.PreparedStatement#addBatch()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void addBatch() throws SQLException {
		info("Added new query to batch");
		
		if (this.params.size() < this.countParams(this.query))
			throw new IllegalStateException("Less Params Than the Required");
		
		String query = this.query + "";

		for (Object o : this.params.values())
			query = this.query.replaceFirst("\\?", o.toString());

		this.queryBatchList.add(query);
		this.clearBatch();
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#clearParameters()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearParameters() throws SQLException {
		this.params.clear();
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#execute()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean execute() throws SQLException {
		info("Query executed");
		
		for (Object o : this.params.values())
			this.query = this.query.replaceFirst("\\?", o.toString());
	
		lastExecutedQuery = query;
		setLastMethodExecuted();

		query = null;

		return true;
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#executeQuery()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSet executeQuery() throws SQLException {
		info("Query executed");

		for (Object o : this.params.values())
			this.query = this.query.replaceFirst("\\?", o.toString());

		lastExecutedQuery = query;
		setLastMethodExecuted();

		query = null;

		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#executeUpdate()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int executeUpdate() throws SQLException {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#getMetaData()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#getParameterMetaData()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setArray(int, java.sql.Array)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setArray(int arg0, Array arg1) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setAsciiStream(int arg0, InputStream arg1) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setAsciiStream(int arg0, InputStream arg1, int arg2) throws SQLException {
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setAsciiStream(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setAsciiStream(int arg0, InputStream arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBigDecimal(int, java.math.BigDecimal)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBigDecimal(int arg0, BigDecimal arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBinaryStream(int arg0, InputStream arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBinaryStream(int arg0, InputStream arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBinaryStream(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBinaryStream(int arg0, InputStream arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBlob(int, java.sql.Blob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBlob(int arg0, Blob arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBlob(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBlob(int arg0, InputStream arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBlob(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBlob(int arg0, InputStream arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBoolean(int, boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBoolean(int arg0, boolean arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setByte(int, byte)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setByte(int arg0, byte arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setBytes(int, byte[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setBytes(int arg0, byte[] arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setCharacterStream(int arg0, Reader arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setCharacterStream(int arg0, Reader arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setCharacterStream(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setCharacterStream(int arg0, Reader arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setClob(int, java.sql.Clob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setClob(int arg0, Clob arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setClob(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setClob(int arg0, Reader arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setClob(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setClob(int arg0, Reader arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setDate(int, java.sql.Date)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setDate(int arg0, Date arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setDate(int, java.sql.Date, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setDate(int arg0, Date arg1, Calendar arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setDouble(int, double)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setDouble(int arg0, double arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setFloat(int, float)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setFloat(int arg0, float arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setInt(int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setInt(int arg0, int arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setLong(int, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setLong(int arg0, long arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNCharacterStream(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNCharacterStream(int arg0, Reader arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNCharacterStream(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNCharacterStream(int arg0, Reader arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNClob(int, java.sql.NClob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNClob(int arg0, NClob arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNClob(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNClob(int arg0, Reader arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNClob(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNClob(int arg0, Reader arg1, long arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNString(int, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNString(int arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNull(int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNull(int arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setNull(int, int, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setNull(int arg0, int arg1, String arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setObject(int arg0, Object arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setObject(int arg0, Object arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setObject(int, java.lang.Object, int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setObject(int arg0, Object arg1, int arg2, int arg3) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setRef(int, java.sql.Ref)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setRef(int arg0, Ref arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setRowId(int, java.sql.RowId)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setRowId(int arg0, RowId arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setSQLXML(int, java.sql.SQLXML)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setSQLXML(int arg0, SQLXML arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setShort(int, short)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setShort(int arg0, short arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setString(int, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setString(int arg0, String arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setTime(int, java.sql.Time)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTime(int arg0, Time arg1) throws SQLException {
		this.params.put(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setTime(int, java.sql.Time, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTime(int arg0, Time arg1, Calendar arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTimestamp(int arg0, Timestamp arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setTimestamp(int, java.sql.Timestamp, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setTimestamp(int arg0, Timestamp arg1, Calendar arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setURL(int, java.net.URL)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setURL(int arg0, URL arg1) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.sql.PreparedStatement#setUnicodeStream(int, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setUnicodeStream(int arg0, InputStream arg1, int arg2) throws SQLException {
		// TODO Auto-generated method stub

	}

}
