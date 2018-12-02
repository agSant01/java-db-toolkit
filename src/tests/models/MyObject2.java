package tests.models;

import db.interfaces.Relational;

public class MyObject2 extends Relational {
	private String name2;
	private String middle2;
	private String last2;
	
	public MyObject2() {
		this.name2 = "k";
		this.middle2= "f";
		this.last2 = "d";
	}

	@Override
	public String getTableName() {
		return "MyTable";
	}

	public String getName2() {
		return name2;
	}

	public String getMiddle2() {
		return middle2;
	}

	public String getLast2() {
		return last2;
	}
}
