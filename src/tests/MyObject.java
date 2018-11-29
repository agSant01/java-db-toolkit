package tests;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import db.interfaces.Relational;

public class MyObject extends Relational {
	private String name;
	private String middle;
	private String last;
	
	public MyObject() {
		this.name = "k";
		this.middle = "f";
		this.last = "d";
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
	
	public static void init(Class<?> cls) {
		for (Method method : cls.getDeclaredMethods()) {
		    if (Modifier.isPublic(method.getModifiers())
		        && method.getParameterTypes().length == 0
		        && method.getReturnType() != void.class
		        && (method.getName().startsWith("get"))
		    ) {
		        System.out.println(method.getName().replaceAll("get", ""));
		    }
		}
	}
}
