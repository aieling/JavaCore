/**
 * 
 */
package Core;

import java.util.Arrays;

/**
 * @author helenekev
 *
 */
public class ArraysClass {
	/* Assigns the specified int value to each element of the specified array of ints. */
	public static void arrayFill() {
		int[] newArray = new int[10];
		Arrays.fill(newArray, 15);
		System.out.println("test "+newArray[1]);
	}
	
	public static void maxValue(){
		int[] sales = {5,12,14,11,19};
		int maxIndex = 0;
		int largestSale = 0;
		
		for(int i = 0; i < sales.length; i++) {
			if(sales[i] > largestSale) {
				maxIndex = i;
			}
		}
		largestSale = sales[maxIndex];
		System.out.println("The largest sale is :"+largestSale);
	}
	
	public static void average() {
		int[] numList = {1,8,4,6,10,27,11};
		int sum = 0;
		for(int i=0; i<numList.length; i++) {
			sum+= numList[i];
		}
		
		double average = (double)sum/numList.length;
		System.out.println("The average is: "+average);
	}
	
	// The two arrays have the same reference
	public static void arrayCopy() {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {0,0,0,0,0,0,0};
		System.out.println("ListB[3]: " + listB[3] + "\n");
		listB = listA;
		System.out.println("ListA[3]: " + listA[3] + "\n");
		System.out.println("ListB[3]: " + listB[3] + "\n");
		listB[3] = -1;
		System.out.println("ListA[3]: " + listA[3] + "\n");
	}
	
	// The two arrays have distinct references
	public static void arrayCopyOf() {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {0,0,0,0,0,0,0};
		System.out.println("ListB[3]: " + listB[3] + "\n");
		listB = Arrays.copyOf(listA, listA.length);
		System.out.println("ListA[3]: " + listA[3] + "\n");
		System.out.println("ListB[3]: " + listB[3] + "\n");
		listB[3] = -1;
		System.out.println("ListA[3]: " + listA[3] + "\n");
		System.out.println("ListB[3]: " + listB[3] + "\n");
	}
	
	public static void isEqual() {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {0,0,0,0,0,0,0};
		String equal = "They are equal";
		
		if(listA.length != listB.length) {
			equal = "They are not equal";
		}
		for(int index = 0; index < listA.length; index++) {
			if(listA[index] != listB[index]) {
				equal = "They are not equal";
				break;
			}
		}
		System.out.println(equal);
	}
	
	public static void arrayString() {
		String[] nameList = new String[3];
		nameList[0] = "helene k";
		nameList[1] = "test 1";
		nameList[2] = "test 2";
		
		for(String name:nameList) {
			System.out.println(name);
		}
	}
	
	public static void sameElement() {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {4,5,1,10,22,20,30};
		int[] listC = new int[listA.length];
		int i = 0;
		for(int a:listA) {
			for(int b:listB) {
				if(a == b) {
					listC[i] = a;
					i++;
				}
			}
		}
		
		System.out.println(Arrays.toString(listC));
	}
	
	public static void sameEvenElement() {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {4,5,1,10,22,20,30};
		int[] listC = new int[listA.length];
		int i = 0;
		for(int a:listA) {
			for(int b:listB) {
				if(a == b && a%2 ==0) {
					listC[i] = a;
					i++;
				}
			}
		}
		System.out.println(Arrays.toString(listC));
	}
	
	public static void  multiDimArrays() {
		int[][] myList = new int[5][];
		myList[1] = new int[7];
		// Length refers to the number of rows 
		System.out.println("Length 2d arrays: "+myList.length);
		// refers to the length of a specific sub array
		System.out.println("Length 2d arrays: "+myList[1].length);
	}

}
