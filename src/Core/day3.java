package Core;
import java.util.Arrays;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {25,14,17,9};
		//bubbleSort(values);
		shuffle(values);
	}
	
	// bubble sort 
	public static void bubbleSort(double[] values) {
		boolean swapOccured = true;
		while(swapOccured) {
			swapOccured = false; // reset our flag
			for(int i=1; i<values.length; ++i) {
				if(values[i-1] < values[i]) {
					double temp = values[i];
					values[i] = values[i-1];
					values[i-1] = temp;
					swapOccured = true;
				}
			}
		}
		System.out.println(Arrays.toString(values));
	}
	
	//Fisher Yates shuffle Algorithm
	//randomize an array values
	public static void shuffle(int[] values) {
		for(int i = values.length -1; i >0; --i) {
			int destIndex = (int)(Math.random() * (i));
			//if(destIndex != i) { //swap
				int temp = values[i];
				values[i] = values[destIndex];
				values[destIndex] = temp;
			//}
		}
			System.out.println(Arrays.toString(values));
	}

}
