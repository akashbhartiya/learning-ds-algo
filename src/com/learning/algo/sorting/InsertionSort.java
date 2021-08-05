package com.learning.algo.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		 int[] arr = {8,4,1,5,9,2};
		 sort(arr);
		 
		 for(int x: arr) {
			 System.out.println(x);
		 }

	}

	
	static void sort(int[] arr) {
		
		
		for(int i = 1 ; i < arr.length ; i++) {
			
			int temp = arr[i];
			int j = i-1;
			for(; j >= 0 ; j--) {
				
				if(arr[j] > temp) {
					
					arr[j+1] = arr[j];
					
				}
				else {
					
					break;
					
				}
				
				
			}
			
			arr[j+1] = temp;
			
			
		}
		
		
	}
	
}
