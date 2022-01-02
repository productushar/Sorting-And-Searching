/*
This java program takes an array of integers and a value to be 
searched for as input from the user and then performs binary search 
to determine whether the array possesses the given element or not.
*/

import java.util.Scanner;

public class J_Binary_Search{
	public static void main(String arg[]){

		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size:");
		int arraySize = in.nextInt();
		int[] values = new int[arraySize];
		System.out.println("\n\nEnter array elements:\n\n");

		for(int i = 0; i < arraySize; i++){
			values[i] = in.nextInt();
		}

		System.out.print("\n\nEnter value to be searched:");
		int searchedValue = in.nextInt();
		boolean found = false;
		int low = 0;
		int pos = 0;
		int high = values.length - 1;

		while (low <= high && !found){
		  pos = (low + high) / 2;
		  if (values[pos] == searchedValue) { found = true; }
		  else if (values[pos] < searchedValue) { low = pos + 1; }
		  else { high = pos - 1; }
		}

		System.out.println("\n\n"+found+"\n\n");
	}
}
