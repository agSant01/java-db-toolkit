/**
 * DbAPI.tests.driver
 * ResultSet.java
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
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

/**
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 */
public class TestResultSet implements ResultSet {

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
	 * @see java.sql.ResultSet#absolute(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean absolute(int arg0) throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#afterLast()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void afterLast() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#beforeFirst()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void beforeFirst() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#cancelRowUpdates()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void cancelRowUpdates() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#clearWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void clearWarnings() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#close()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void close() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#deleteRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void deleteRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#findColumn(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int findColumn(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#first()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean first() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getArray(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Array getArray(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getArray(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Array getArray(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getAsciiStream(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getAsciiStream(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getAsciiStream(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getAsciiStream(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBigDecimal(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public BigDecimal getBigDecimal(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBigDecimal(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public BigDecimal getBigDecimal(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBigDecimal(int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public BigDecimal getBigDecimal(int arg0, int arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBigDecimal(java.lang.String, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public BigDecimal getBigDecimal(String arg0, int arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBinaryStream(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getBinaryStream(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBinaryStream(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getBinaryStream(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBlob(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Blob getBlob(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBlob(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Blob getBlob(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBoolean(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean getBoolean(int arg0) throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBoolean(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean getBoolean(String arg0) throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getByte(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public byte getByte(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getByte(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public byte getByte(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBytes(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public byte[] getBytes(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getBytes(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public byte[] getBytes(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getCharacterStream(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Reader getCharacterStream(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getCharacterStream(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Reader getCharacterStream(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getClob(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Clob getClob(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getClob(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Clob getClob(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getConcurrency()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getConcurrency() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getCursorName()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getCursorName() throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDate(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Date getDate(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDate(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Date getDate(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDate(int, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Date getDate(int arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDate(java.lang.String, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Date getDate(String arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDouble(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public double getDouble(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getDouble(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public double getDouble(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getFetchDirection()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getFetchDirection() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getFetchSize()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getFetchSize() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getFloat(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public float getFloat(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getFloat(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public float getFloat(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getHoldability()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getHoldability() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getInt(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getInt(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getInt(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getInt(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getLong(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public long getLong(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getLong(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public long getLong(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getMetaData()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNCharacterStream(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Reader getNCharacterStream(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNCharacterStream(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Reader getNCharacterStream(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNClob(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public NClob getNClob(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNClob(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public NClob getNClob(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNString(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getNString(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getNString(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getNString(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Object getObject(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Object getObject(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(int, java.util.Map)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Object getObject(int arg0, Map<String, Class<?>> arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(java.lang.String, java.util.Map)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Object getObject(String arg0, Map<String, Class<?>> arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(int, java.lang.Class)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public <T> T getObject(int arg0, Class<T> arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getObject(java.lang.String, java.lang.Class)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public <T> T getObject(String arg0, Class<T> arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getRef(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Ref getRef(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getRef(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Ref getRef(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getRow() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getRowId(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public RowId getRowId(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getRowId(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public RowId getRowId(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getSQLXML(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLXML getSQLXML(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getSQLXML(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLXML getSQLXML(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getShort(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public short getShort(int arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getShort(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public short getShort(String arg0) throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getStatement()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Statement getStatement() throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getString(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getString(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getString(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String getString(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTime(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Time getTime(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTime(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Time getTime(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTime(int, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Time getTime(int arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTime(java.lang.String, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Time getTime(String arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTimestamp(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Timestamp getTimestamp(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTimestamp(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Timestamp getTimestamp(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTimestamp(int, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Timestamp getTimestamp(int arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getTimestamp(java.lang.String, java.util.Calendar)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public Timestamp getTimestamp(String arg0, Calendar arg1) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getType()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public int getType() throws SQLException {
		 
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getURL(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public URL getURL(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getURL(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public URL getURL(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getUnicodeStream(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getUnicodeStream(int arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getUnicodeStream(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public InputStream getUnicodeStream(String arg0) throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#getWarnings()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public SQLWarning getWarnings() throws SQLException {
		 
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#insertRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void insertRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#isAfterLast()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isAfterLast() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#isBeforeFirst()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isBeforeFirst() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#isClosed()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isClosed() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#isFirst()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isFirst() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#isLast()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean isLast() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#last()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean last() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#moveToCurrentRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void moveToCurrentRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#moveToInsertRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void moveToInsertRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#next()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean next() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#previous()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean previous() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#refreshRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void refreshRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#relative(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean relative(int arg0) throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#rowDeleted()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean rowDeleted() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#rowInserted()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean rowInserted() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#rowUpdated()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean rowUpdated() throws SQLException {
		 
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#setFetchDirection(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setFetchDirection(int arg0) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#setFetchSize(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void setFetchSize(int arg0) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateArray(int, java.sql.Array)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateArray(int arg0, Array arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateArray(java.lang.String, java.sql.Array)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateArray(String arg0, Array arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(int arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(String arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(int arg0, InputStream arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(String arg0, InputStream arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(int arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateAsciiStream(java.lang.String, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateAsciiStream(String arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBigDecimal(int, java.math.BigDecimal)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBigDecimal(int arg0, BigDecimal arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBigDecimal(java.lang.String, java.math.BigDecimal)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBigDecimal(String arg0, BigDecimal arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(int arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(String arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(int arg0, InputStream arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(String arg0, InputStream arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(int arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBinaryStream(java.lang.String, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBinaryStream(String arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(int, java.sql.Blob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(int arg0, Blob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(java.lang.String, java.sql.Blob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(String arg0, Blob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(int, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(int arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(java.lang.String, java.io.InputStream)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(String arg0, InputStream arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(int, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(int arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBlob(java.lang.String, java.io.InputStream, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBlob(String arg0, InputStream arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBoolean(int, boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBoolean(int arg0, boolean arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBoolean(java.lang.String, boolean)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBoolean(String arg0, boolean arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateByte(int, byte)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateByte(int arg0, byte arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateByte(java.lang.String, byte)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateByte(String arg0, byte arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBytes(int, byte[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBytes(int arg0, byte[] arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateBytes(java.lang.String, byte[])
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateBytes(String arg0, byte[] arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(int arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(String arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(int arg0, Reader arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(String arg0, Reader arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(int arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateCharacterStream(java.lang.String, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateCharacterStream(String arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(int, java.sql.Clob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(int arg0, Clob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(java.lang.String, java.sql.Clob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(String arg0, Clob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(int arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(java.lang.String, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(String arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(int arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateClob(java.lang.String, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateClob(String arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateDate(int, java.sql.Date)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateDate(int arg0, Date arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateDate(java.lang.String, java.sql.Date)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateDate(String arg0, Date arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateDouble(int, double)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateDouble(int arg0, double arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateDouble(java.lang.String, double)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateDouble(String arg0, double arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateFloat(int, float)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateFloat(int arg0, float arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateFloat(java.lang.String, float)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateFloat(String arg0, float arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateInt(int, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateInt(int arg0, int arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateInt(java.lang.String, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateInt(String arg0, int arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateLong(int, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateLong(int arg0, long arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateLong(java.lang.String, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateLong(String arg0, long arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNCharacterStream(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNCharacterStream(int arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNCharacterStream(java.lang.String, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNCharacterStream(String arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNCharacterStream(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNCharacterStream(int arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNCharacterStream(java.lang.String, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNCharacterStream(String arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(int, java.sql.NClob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(int arg0, NClob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(java.lang.String, java.sql.NClob)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(String arg0, NClob arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(int, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(int arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(java.lang.String, java.io.Reader)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(String arg0, Reader arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(int, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(int arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNClob(java.lang.String, java.io.Reader, long)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNClob(String arg0, Reader arg1, long arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNString(int, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNString(int arg0, String arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNString(java.lang.String, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNString(String arg0, String arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNull(int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNull(int arg0) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateNull(java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateNull(String arg0) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateObject(int, java.lang.Object)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateObject(int arg0, Object arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateObject(java.lang.String, java.lang.Object)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateObject(String arg0, Object arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateObject(int, java.lang.Object, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateObject(int arg0, Object arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateObject(java.lang.String, java.lang.Object, int)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateObject(String arg0, Object arg1, int arg2) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateRef(int, java.sql.Ref)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateRef(int arg0, Ref arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateRef(java.lang.String, java.sql.Ref)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateRef(String arg0, Ref arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateRow()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateRow() throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateRowId(int, java.sql.RowId)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateRowId(int arg0, RowId arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateRowId(java.lang.String, java.sql.RowId)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateRowId(String arg0, RowId arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateSQLXML(int, java.sql.SQLXML)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateSQLXML(int arg0, SQLXML arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateSQLXML(java.lang.String, java.sql.SQLXML)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateSQLXML(String arg0, SQLXML arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateShort(int, short)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateShort(int arg0, short arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateShort(java.lang.String, short)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateShort(String arg0, short arg1) throws SQLException {}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateString(int, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateString(int arg0, String arg1) throws SQLException {}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateString(java.lang.String, java.lang.String)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateString(String arg0, String arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateTime(int, java.sql.Time)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateTime(int arg0, Time arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateTime(java.lang.String, java.sql.Time)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateTime(String arg0, Time arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateTimestamp(int, java.sql.Timestamp)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateTimestamp(int arg0, Timestamp arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#updateTimestamp(java.lang.String, java.sql.Timestamp)
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public void updateTimestamp(String arg0, Timestamp arg1) throws SQLException {
		 
		
	}

	/* (non-Javadoc)
	 * @see java.sql.ResultSet#wasNull()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public boolean wasNull() throws SQLException {
		 
		return false;
	}

}
