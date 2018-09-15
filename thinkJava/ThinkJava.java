/**
 * 
 */
package thinkJava;

import java.util.Scanner;

/**
 * @author amami
 *
 */
public class ThinkJava {

	final double C_PI = 3.14159265358979; // java.util.Formatter
	// System.out.printf("pi4places = %.4f", 3.14159265);
	public static String scannedData;

	public String scanIt() {
		Scanner Scn = new Scanner(System.in);
		scannedData = Scn.nextLine();
		Scn.close();
		return scannedData;

	}

	public void scanDefect() {

		int age = 0;
		String name, input;
		boolean zFlag = true;
		String zinput = "zstring as scanner input";
		Scanner Scn = new Scanner(System.in);
		Scanner Scn_str = new Scanner(zinput);
		do {
			System.out.println("What is your age? ");

			if (!Scn.hasNextInt()) {
				System.err.println("Enter a integer only. \nTry again!");
			} else {
				age = Scn.nextInt();
				zFlag = false;
			}
			Scn.nextLine();

		} while (zFlag);

		System.out.println("What is your Name? ");
		name = Scn.nextLine();
		input = Scn_str.nextLine();
		System.out.printf("Hello %s, age %d\n, input %s\n", name, age, input);
		Scn.close();
		Scn_str.close();
	}

	public void scanRecurr() {
		int age = 0;
		Scanner Scn = new Scanner(System.in);
		System.out.println("What is your age?");
		
		try {
			age = Scn.nextInt();
			Scn.nextLine();
		} catch (Exception e) {
			System.err.println("Enter a integer only. \nTry again!");
			Scn.nextLine();
			scanRecurr();

		}
		if (age > 0) {
			System.out.printf("Hello There, your age is: %d\n", age);			
		}

		Scn.close();
	}

}
