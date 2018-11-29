package tests;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import db.DbConHandler;
import db.engines.MySQL;
import db.interfaces.Connectable;

public class Test {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//		MyObject myObject = new MyObject();
		Connectable mySQL = new MySQL("localhost", "gabe", "123456", "mydb");
		try {
			DbConHandler db = new DbConHandler(mySQL);
			//			db.insert(myObject);
			
			db.init(MyObject.class, true);

			db.init(MyObject.class, false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}








