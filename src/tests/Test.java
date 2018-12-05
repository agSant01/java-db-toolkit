package tests;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import db.DbConHandler;
import tests.drivers.TestConnection;
import tests.drivers.TestPreparedStatement;
import tests.drivers.TestStatement;
import tests.engines.MySQLTest;
import tests.models.DateModel;
import tests.models.MyObject;
import tests.models.MyObject2;
import tests.utils.Debuger;


public class Test extends Debuger {

	private DbConHandler db;
	private TestConnection driver;

	@Before
	public void setup() throws SQLException {
		newLine();
		info("Started setup");
		String user = "gabe";
		String pass = "12345";
		String db = "mydb";
		String host = "localhost";

		MySQLTest sql = new MySQLTest(host, user, pass, db);

		assertTrue(sql.getDatabase() == db);
		assertTrue(sql.getUser() == user);
		assertTrue(sql.getDatabase() == db);
		assertTrue(sql.getHost() == host);

		this.db = new DbConHandler(sql);	
		this.driver = (TestConnection) this.db.getConnection();
	}

	@org.junit.Test
	public void testObjectInsert() throws SQLException {

		newLine();
		info("");
		MyObject object = new MyObject("Gabriel", "Salvador", "Santiago");

		this.db.insert(object);
		TestPreparedStatement pstmt = this.driver.getPstmt();

		assertTrue("Last Method call was not prepareStatement()", this.driver.getLastMethodExecuted().equals("prepareStatement()"));
		assertTrue("Bad insertion query for " + object, pstmt.getLastQuery().equals("INSTER INTO MyObject(Last, Middle, Name) VALUES('Santiago', 'Salvador', 'Gabriel')"));
		isClosed(pstmt);
	}

	@org.junit.Test
	public void testSingleTableInit() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		newLine();
		info("");
		this.db.initTables(MyObject.class);
		TestStatement stmt = this.driver.getStmt();
		
		assertTrue("Invalid create table query", stmt.getLastQuery().equals("Create Table If Not Exists MyObject (Last Varchar(40) Not Null, Middle Varchar(40) Not Null, Name Varchar(40) Not Null);"));
		isClosed(stmt);
	}
	
	@org.junit.Test
	public void testDateTableInit() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		newLine();
		info("");
		this.db.initTables(DateModel.class);
		TestStatement stmt = this.driver.getStmt();
		
		info(stmt.getLastQuery());
		
		assertTrue("Invalid create table query", stmt.getLastQuery().equals("Create Table If Not Exists DateModel (MyDate Timestamp Not Null);"));
		isClosed(stmt);
	}

	@org.junit.Test
	public void testMultipleTableInit() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		newLine();
		info("");
		this.db.initTables(MyObject.class, MyObject2.class);
		TestStatement stmt = this.driver.getStmt();
		
		assertTrue("Invalid create table query", stmt.getLastBatch().equals(
				new ArrayList<String>() {/**
				 * 
				 */
					private static final long serialVersionUID = 1L;

					{
						add("Create Table If Not Exists MyObject (Last Varchar(40) Not Null, Middle Varchar(40) Not Null, Name Varchar(40) Not Null);");
						add("Create Table If Not Exists MyObject2 (Last2 Varchar(40) Not Null, Middle2 Varchar(40) Not Null, Name2 Varchar(40) Not Null);");
					}}
				)
				);
		isClosed(stmt);
	}
	
	@org.junit.Test
	public void testExcecute() throws SQLException {
		newLine();
		info("");
		
		String query = "Insert Into Table(ID, NAME) VALUES('1', 'Michael');";
		this.db.execute(query);

		TestStatement stmt = this.driver.getStmt();
		
		assertTrue("Wrong query", stmt.getLastQuery().equals(query));
		isClosed(stmt);
	}

	private void isClosed(TestStatement stmt) {
		assertTrue("Not closed", stmt.lastExecuted().equals("close()"));		
	}

	private void isClosed(TestPreparedStatement stmt) {
		assertTrue("Not closed", stmt.lastExecuted().equals("close()"));		
	}
}








