package Core;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		//Declare an array then initialize it to a fixed size
		int[] arrayName = new int[10];
		
		//Directly with values in the braces and without the keyword new
		double[] sales = {1.2, 2.5, 5.6};
		
		//Default value of primitive
//		int[] i = new int[2];
//		boolean[] value = new boolean[2];
//		String[] str = new String[2];
//		System.out.println("int : "+i[0] +" \nboolean : "+value[0]+"\nstr : "+str[0] );
//		
		//array fill
		int[] arrayFill = new int[10];
		System.out.println(arrayFill.length);
		Arrays.fill(arrayFill,5);
		System.out.println("ArrayFill : "+arrayFill[6]);
		
		// find average 
		int[] numlist = {1,8,4,6,10,27,11};
		int sum = 0;
		for(int ind = 0; ind<numlist.length; ind++) {
			sum+= numlist[ind];
		}
		
		double average = (double) sum/numlist.length;
		System.out.println("Average "+average);
		
		//copy an array
		//CopyOF
		// Arrays.equals is a method : content comparison
		// == is an operator : address comparison
//		int[] listA = {5,10,15,20,25,30,35} ;
//		int [] listB = {5,10,15,20,25,30,35} ;
//		System.out.println("ListB[3]" + listB[3]);
//		listB = Arrays.copyOf(listA, listA.length);
//		System.out.println("ListA[3] " + listA[3]);
//		System.out.println("ListB[3] " + listB[3]);
//		listB[3] = -1;
//		
//		System.out.println("ListA[3] " + listA[3]);
//		System.out.println(listA.equals(listB));
//		
		//ForEach or Enhanced for statement
		String[] nameList = {
				"Toto",
				"Tata",
				"mimi",
				"lulu"
		};
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
		// ForEach example
		
		
		
	
				int[] listA= {5,10,15,20,25,30,35};
				int[] listB= {4,5,1,10,22,20,30};
				int[] listC= new int[listA.length];
				int[] listD = new int[listA.length+listB.length];
				int k=0;
//				for(int i:listA)
//				{
//					for(int j: listB)
//					{
//						if(i==j)
//						{
//							listC[k]=i;
//							k++;
//						}
//						
//					}
//				}
//				System.out.println(Arrays.toString(listC));
				//*26
				
				for(int i:listA)
				{
					for(int j: listB)
					{
						if(i==j && i%2 ==0 && j%2==0 )
						{
							listD[k]=i;
							k++;
						}
						
					}
				}
//				int[] finalList = Arrays.copyOfRange(listD, 0, k);
//				System.out.println(Arrays.toString(finalList));
				
				int[][] list = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
				};
//				System.out.println(Arrays.deepToString(list));
//				System.out.println(list[1][2]);
				
				int[][] newArr = new int[5][];
				System.out.println(Arrays.deepToString(newArr));
				
				newArr[0] = new int[3];
				newArr[0][0] = 1;
				newArr[0][1] = 2;
				newArr[0][2] = 3;
				newArr[1] = new int[4];
				newArr[1][0] = 1;
				newArr[1][1] = 2;
				newArr[1][2] = 3;
				newArr[1][3] = 4;
//				System.out.println(Arrays.deepToString(newArr));
				//System.out.println(newArr.length);
//				System.out.println(newArr[0].length);
//				System.out.println(newArr[1].length);
				
				for(int row=0; row < list.length; row++) {
					for(int col=0; col < list[row].length; col++) {
						System.out.println(list[row][col]);
					}
					System.out.println();
				}
				
				
				
	}
	
	
}


