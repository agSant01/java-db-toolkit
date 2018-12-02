package db.utils;

import java.util.Comparator;

/**
 * The representation of a column of a Database table for a row
 * Stores the data type, column, and data in the column.
 * A collection of Columns would make the representation of a Row in the database for a certain object
 * 
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 * @param <E>
 */
public class Column<E> {
	private String columnName;
	private E value;
	private Class<?> type;

	/**
	 * 
	 * Creates a Column instance with the data type.
	 *
	 * @author Gabriel S. Santiago
	 * @param columnName
	 * @param value
	 * @param type
	 */
	public Column(String columnName, E value, Class<?> type) {
		this.columnName = columnName;
		this.value = value;
		this.type = type;
	}

	/**
	 * 
	 * Creates a Column instance without the data type of the column.
	 *
	 * @author Gabriel S. Santiago
	 * @param columnName
	 * @param value
	 */
	public Column(String columnName, E value) {
		this(columnName, value, null);
	}

	/**
	 * Creates a Column instance without the value.
	 *
	 * @author Gabriel S. Santiago
	 * @param columnName
	 * @param type
	 */
	public Column(String columnName, Class<?> type) {
		this(columnName, null, type);
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return this.columnName;
	}

	/**
	 * @return the value
	 */
	public E getValue() {
		return this.value;
	}

	/**
	 * @return the type
	 */
	public Class<?> getType() {
		return this.type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @date Dec 1, 2018
	 * @author Gabriel S. Santiago
	 */
	@Override
	public String toString() {
		return String.format("{ 'ColumnName': '%s', 'Value': '%s' }", this.getColumnName(), this.getValue());
	}


	public static Comparator<Column<?>> descendingColumnName() {
		return new Comparator<Column<?>>() {
			@Override
			public int compare(Column<?> arg0, Column<?> arg1) {
				return arg0.getColumnName().compareTo(arg1.getColumnName());
			}
		};

	}
}
