package com.learning.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {9,2,3,4,5,6,0};
		sortArray(arr);
		
		for(int x : arr) {
			System.out.println(x);
		}


	}

	
	public static void sortArray(int [] arr) {
		
		
		boolean isSwapReq= false;
		
		for(int i = 0 ; i< arr.length;i++) {
			int min = i;
			for(int j = i+1; j < arr.length;j++) {
				
				if(arr[min] > arr[j]) {
					min = j;
					isSwapReq = true;
				}
				
				
			}
			
			if(isSwapReq) {
			swap(arr, min, i);
			}
			
			isSwapReq = false;
			
			
		}
		
		
	}
	
	private static void swap(int[] arr, int a, int b) {
		System.out.println(String.format("Swapping {%s} and {%s}", a,b));
		
		arr[a] = arr[a]^arr[b];
    	arr[b] = arr[a]^arr[b];
    	arr[a] = arr[a]^arr[b];
		
	}
}
