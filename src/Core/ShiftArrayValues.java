package Core;
import java.util.Arrays;

public class ShiftArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {0,1,2,3,4,5,6,7};
		//deleteFromArray(list,6);
		insertInttoArray(list, 15,4);
		System.out.println(Arrays.toString(list));
		
		//binarySearchRecurive(list, 0 + 1, list.length, 37);
	}
	
	public static void deleteFromArray(int[] values, int indexToDelete) {
		for(int i = indexToDelete; i < values.length -1; ++i) {
			values[i] = values[i+1];
		}
	}
	
	public static void insertInttoArray(int[] values, int newValue, int newValueIndex) {
		int nextValue = 0;

		for(int i = values.length; i<values.length-1; ++i) {
			nextValue = values[i+1];
			values[i+1] = nextValue;
		}
		values[newValueIndex] = newValue;
	}
	
	public static int binarySearchRecursive(int[] values, int i0, int i1, int searchValue) {
		if(i0 > i1) return ~i0;
		int iMid = (i0 + i1) /2;
		if(values[iMid] == searchValue) return iMid;
		if(values[iMid] > searchValue)
			return binarySearchRecursive(values, i0, iMid -1, searchValue);
		return binarySearchRecursive(values, iMid +1, i1, searchValue);
	}
	
	
	
	
	
	
	
	
	
	public static int binarySearch(int[] values, int searchValue) {
		int i0 = 0, i1 = values.length -1;
		while(i0 < i1) {
			int iMid = (i0 + i1) / 2, v= values[iMid];
			if(v == searchValue) return iMid;
			if(v > searchValue) i1 = iMid -1; else i0 = iMid + 1;
			
		}
		return ~i0;
	}


}
