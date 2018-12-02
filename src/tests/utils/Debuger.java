/**
 * DbAPI.tests
 * Debuger.java
 * @date Dec 1, 2018
 * @author Gabriel S. Santiago
 */
package tests.utils;

/**
 * @author Gabriel S. Santiago
 * @date Dec 1, 2018
 *
 */
public class Debuger {
	public void error(Object log) {
		log(log, "error");
	}
	
	public void info(Object o) {
		log(o, "info");
	}
	
	public void log(Object log, String stat) {
		if (stat == "error") {
			System.err.print(getClassName() + "." + getMethodName());
			System.err.println(" -> Error: " + log);
			System.err.print(divider());
		} else {
			System.out.print(getClassName() + "." + getMethodName());
			System.out.println(" -> Log: " + log);
			System.out.print(divider());
		}
	}
	
	public void newLine() {
		System.out.println("");
	}
	
	private String getClassName() {
		return this.getClass().getSimpleName();
	}
	
	private String getMethodName() {
		return Thread.currentThread().getStackTrace()[4].getMethodName() + "()"; 
	}
	
	private String divider() {
		return "";
	}
}