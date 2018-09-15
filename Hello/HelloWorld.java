/**Package name should have been start with a lower case 
 * This should be the only class with static void main method
 */
package Hello;

//import thinkJava.*;
import thinkJava.ThinkJava;

/**
 * @author amami This main method will call ONLY class ThinkJava; ThinkJava will
 *         have all other method calls
 */
public class HelloWorld {
	/**
	 * Purpose is to test new developments.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println(System.out);!this will print out package
		ThinkJava TJ = new ThinkJava();
		// String printData = TJ.scanIt();
		// System.out.println(printData);
		// TJ.scanDefect();

		TJ.scanRecurr();
	}
}
