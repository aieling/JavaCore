package Core;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Give a number :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Your input is : "+input);
		System.out.println("What's your name?");
		String name = sc.next();
		System.out.println("Hello "+name);
		System.out.println("How much money do you have right now?");
		double money = sc.nextDouble();
		System.out.println("You have "+money+" dollars at the moment");

	}

}
