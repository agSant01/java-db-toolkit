package tests.models;

import db.interfaces.Relational;

public class MyObject extends Relational {
	private String name;
	private String middle;
	private String last;
	
	public MyObject() {}

	public MyObject(String name, String middle, String last) {
		this.name = name;
		this.middle = middle;
		this.last = last;
	}

	@Override
	public String getTableName() {
		return "MyTable";
	}

	public String getName() {
		return name;
	}

	public String getMiddle() {
		return middle;
	}

	public String getLast() {
		return last;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String toString() {
		return "MyObject [name=" + name + ", middle=" + middle + ", last=" + last + "]";
	}
}
