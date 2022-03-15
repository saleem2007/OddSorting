package com.oddsorting;

import java.util.Arrays;

public class OddSorting {
	
	public static void main(String[] args) {
		
		/* You are given an array of numbers. You have to sort the odd numbers
		 * in ascending order while leaving the even numbers at their original place.*/
		
		int[] arr = {5, 8, 6, 3, 4};
		int temp;
		
		System.out.println("Numbers in the array before sorting");
		
		for (int x = 0; x < arr.length; x++) {
			
		System.out.print(" " + arr[x]);
			
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				//case-1 when both indexes are eligible then swap
				// is arr[o] and arr[1] % 2 == 1 then execute the condition below
				if (isEligible(arr[j]) && isEligible(arr[j+1])) {
					
					if (arr[j] > arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						}
				//case-2 only the first index is eligible 	
				// is arr[0] % 2 == 1 then execute the condition below
				// arr[0] = 5	
				} else if (isEligible(arr[j])) {
					
					int firstIndex = j; // value = 0
					int secondIndex = -1; // trying to find the value array can never be -1
					
					// need to run another loop to find the second index 
					for (int k = j+1; k < arr.length-1; k++) {
						
						// is arr[1] % 2 == 1 if yes then set that second index to that value else continue running the loop
						// until it finds the number which is eligible
						if (isEligible(arr[k])) {
							secondIndex = k; // once the value is found then set that second index.
							break; // no need to run the loop break out of it.
							
						} 
						
					// if we find the second index then the value will always be greater than -1 then execute the condition.				
						} 		if (secondIndex > -1) {
						
						// since we are sorting in ascending order then we must compare two odd numbers first to be greater than the
						// other just to assume it is true. If true then do the swap or else skip to continue.
								if (arr[firstIndex] > arr[secondIndex]) {
									temp = arr[firstIndex];
									arr[firstIndex] = arr[secondIndex];
									arr[secondIndex] = temp;
								
									}
						
								} else {
							
										continue;
							
									}
					} 
				
			}
		}
		
		System.out.println();
		System.out.println("Numbers in the array after sorting");
		System.out.print("[ ");
		for (int x = 0; x < arr.length; x++) {
			
			System.out.print(arr[x] + " ");
			
		}
		System.out.print("]");
		
		
	}
	
	// declaring a function to sort only the odd numbers.
	public static boolean isEligible(int num) {
		
		if (num % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

}
