package Core;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Controls grade = new Controls();
		System.out.println(grade.gradeStudent(75)+"\n");
		
		/* Switch statement */
		System.out.println(grade.printQuestion());
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		grade.checkAnswers(input);

		
		Loops loop = new Loops();
		loop.breakApplied();
		loop.displayOddSequences();
		loop.multiple();
		
		System.out.println("\nEnter the size of the array :");
		int arraySize = sc.nextInt();
		int[] arrayInt = new int[arraySize];
		System.out.println(arrayInt.length);
		sc.close();
		
		ArraysClass.arrayFill();
		ArraysClass.maxValue();
		ArraysClass.average();
		ArraysClass.arrayCopy();
		ArraysClass.arrayCopyOf();
		ArraysClass.isEqual();
		ArraysClass.arrayString();
		ArraysClass.sameElement();
		ArraysClass.sameEvenElement();
		ArraysClass.multiDimArrays();
		
		
	}

}
