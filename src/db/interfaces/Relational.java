package db.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import db.utils.Column;

public abstract class Relational {
	private ArrayList<Column<?>> values = null;
	
	public Relational() {}
	
	public abstract String getTableName();
	
	public ArrayList<Column<?>> getSchema() {
		if (this.values != null) {
			return this.values;
		}
		
		this.values = new ArrayList<>();
		
		for (Method method : this.getClass().getDeclaredMethods()) {
		    if (Modifier.isPublic(method.getModifiers())
		        && method.getParameterTypes().length == 0
		        && method.getReturnType() != void.class
		        && (method.getName().startsWith("get"))
		    ) {
		        Object value;
				try {
					value = method.invoke(this);
					Class<?> type = method.getReturnType();
					values.add(new Column<Object>(method.getName().replaceAll("get", ""), value, type));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
		    }
		}
		return values;
	}
}
