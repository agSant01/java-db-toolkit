/**
 * DbAPI.tests.models
 * DateModel.java
 * @date Dec 4, 2018
 * @author Gabriel S. Santiago
 */
package tests.models;

import java.util.Date;

import db.interfaces.Relational;

/**
 * @author Gabriel S. Santiago
 * @date Dec 4, 2018
 *
 */
public class DateModel extends Relational {
	private Date myDate;
	
	/**
	 * Creates a {} instance
	 *
	 * @author Gabriel S. Santiago
	 */
	public DateModel() {
		this.myDate = new Date();
	}

	public Date getMyDate() {
		return myDate;
	}
}
