/**
 * DbAPI.tests.models
 * ChangedTblName.java
 * @date Dec 4, 2018
 * @author Gabriel S. Santiago
 */
package tests.models;

import db.interfaces.Relational;

/**
 * @author Gabriel S. Santiago
 * @date Dec 4, 2018
 *
 */
public class ChangedTblName extends Relational {
	
	private int a;
	
	/**
	 * Creates a ChangedTblName instance
	 *
	 * @author Gabriel S. Santiago
	 */
	public ChangedTblName() {
		// TODO Auto-generated constructor stub
	}
	
	public ChangedTblName(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	@Override
	public String getTableName() {
		return "Changed";
	}

}
