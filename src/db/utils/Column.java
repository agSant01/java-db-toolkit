package db.utils;

public class Column<E> {
	private String columnName;
	private E value;
	private Class<?> type;
	
	public Column(String columnName, E value, Class<?> type) {
		this.columnName = columnName;
		this.value = value;
		this.type = type;
	}
	
	public Column(String columnName, E value) {
		this(columnName, value, null);
	}
	
	public Column(String columnName, Class<?> type) {
		this(columnName, null, type);
	}

	public String getColumnName() {
		return this.columnName;
	}

	public E getValue() {
		return this.value;
	}
	
	public Class<?> getType() {
		return this.type;
	}
}
