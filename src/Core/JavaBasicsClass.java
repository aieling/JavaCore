/**
 * 
 */
package Core;

import java.util.Scanner;

/**
 * @author helenekev
 *
 */
public class JavaBasicsClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// question 1
		int firstValue = 1;
		int secondValue = 2;
		//System.out.println(firstValue+ " "+secondValue);
		
		// question 2
		double firstDouble = 2.3;
		double secondDouble = 4.1;
		double sum =firstDouble + secondDouble;
		//System.out.println(sum);
		
		// question 3
		int numb = 8;
		double doub = 3.5;
		double total = (double) numb + doub;
		//System.out.println(total);
		
		// question 4
		double val1 = 8.3;
		int val2 = 5;
		double div = (double) val2 / val1;
		//System.out.println(div);
		
		// question 5
		int x = 5;
		double y = 6;
		double q = y / x;
		//System.out.println(q);
		
		
		//question 6
		final int count = 1;
		//System.out.println("count: "+count);
		
		
		
		
		
		
		double coffee = 3.99 ;
		double tea = 4.50;
		double cappuccino = 4;
		
		double subTotal = 0;
		double totalSale = 0;
		
		double firstOrder = 3* coffee;
		double secondOrder = 4* tea + 3*coffee;
		final double SALES_TAX = 0.065;
		subTotal = firstOrder + secondOrder;
		totalSale = subTotal * SALES_TAX;
//		0
		
		int coffeeCount = 2;
		int teaCount = 1;

		firstOrder = coffeeCount * coffee + teaCount * tea;
//		
//		System.out.format("Coffee: "+"%2d"+" @ "+"%.2f"+ " = "+"$%.2f \n", coffeeCount, coffee, coffeeCount*coffee);
//		System.out.format("Tea: "+"%2d"+" @ "+"%.2f"+ " = "+"$%.2f \n", teaCount, tea, teaCount*tea);
//		System.out.format("Subtotal: "+"$%.2f \n", firstOrder);
//		System.out.format("Sales Tax: " +"$%.2f \n", SALES_TAX*firstOrder);
//		System.out.format("Total: "+"$%.2f \n", firstOrder + SALES_TAX*firstOrder);
//		
		
		String firstName = "helene";
		String lastName = "kev";
		
//		System.out.println(firstName +" "+ lastName);
//		System.out.println(firstName.concat(" "+lastName));
//		System.out.println(firstName.length()+lastName.length());
//		
//		String var1 = "Hello";
//		String var2 = "Hello";
//		String var3 = "World";
//		String var4 = "world";
//		
////		System.out.println(var1.contentEquals(var2));
////		System.out.println(var3.contentEquals(var4));
//		
//		String hello = "Hello World!";
//		hello.charAt(6);
		
//		Scanner sc = new Scanner(System.in);
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		int sumScan = input1+input2;
//		System.out.println(sumScan);
//		sc.close();
		
		int[] array = new int[16];
		int input = 16;
		int i = 15;
		
		while(input > 0) {
			if(input%2 == 1) {
				array[i] = 1;
				input = input/2;
			}
			else {
				array[i] = 0;
				input = input/2;
			}
			i--;
		}
		
		for(int j : array) {
			System.out.print(j);
		}
		
//		int[] array = new int[16];
//		String input = "0010";
//		int i = 15;
//		double result = 0; 
//		int count1 = 0;
//		char zero = 0;
//		
//		for(int ind = input.length() -1; ind>=0; ind--) {
//			if(input.charAt(ind) == zero) {
//
//			}
//			else {
//				result = result + Math.pow(2, count1);
//				System.out.println(result);
//			}
//			count1++;
//		}
//		System.out.print(result);
		
		
//		public int fibinacci(int n) {
//	        int x = 0;
//	        int prev = 0;
//	        int sum = 1;
//	        int current = 1;
//	        while (x < n) {
//	            sum = prev + current;
//	            prev = current;
//	            current = sum;
//	            System.out.println(sum);
//	            x++;
//	        }
//	        return sum;
//	    } 
		
	}

}
