/**
 * DbAPI.tests
 * ModelTest.java
 * @date Dec 4, 2018
 * @author Gabriel S. Santiago
 */
package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tests.models.ChangedTblName;
import tests.models.MyObject;
import tests.models.MyObject2;
import tests.utils.Debuger;

/**
 * @author Gabriel S. Santiago
 * @date Dec 4, 2018
 *
 */
public class ModelTest extends Debuger {
	
	@Test
	public void TestModelTableName() {
		MyObject object = new MyObject("3", "w", "3");
		MyObject2 object2 = new MyObject2();

		info(object.getTableName());
		info(object2.getTableName());
		info(object.getTableName());
		
		assertTrue("Invalid Obect Table name", object.getTableName().equals("MyObject"));
	}
	
	@Test
	public void testModel() {
		ChangedTblName o = new ChangedTblName(3);
		
		info(o.getTableName());
		assertTrue("Invaled 'ChangedTblName' tbl name", o.getTableName().equals("Changed"));
		
	}

}
