package db.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import db.utils.Column;

/**
 * Abstract class used to convert any Java Model to a DB exportable object. 
 * 
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 */
public abstract class Relational {
	
	/**
	 * @return the tableName
	 */
	public abstract String getTableName();
	
	/**
	 * Returns a collection of Columns, the Row representation of the object for a Database
	 *
	 * @author Gabriel S. Santiago
	 * @date Dec 1, 2018
	 * @return
	 */
	public ArrayList<Column<?>> getParsedSchema() {
		ArrayList<Column<?>> values = new ArrayList<>();
		
		for (Method method : this.getClass().getDeclaredMethods()) {
		    if (Modifier.isPublic(method.getModifiers())
		        && method.getParameterTypes().length == 0
		        && method.getReturnType() != void.class
		        && method.getName().startsWith("get")
		        && !method.getName().contains("TableName")
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
		values.sort(Column.descendingColumnName());
		
		return values;
	}
}
