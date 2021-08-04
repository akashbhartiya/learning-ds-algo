package com.learning.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {1,9,7,5,0,33,24,-1};
		sortArray(arr);
		
		for(int x : arr) {
			System.out.println(x);
		}

	}
	
	
	private static void swap(int[] arr, int a, int b) {
		
		arr[a] = arr[a]^arr[b];
    	arr[b] = arr[a]^arr[b];
    	arr[a] = arr[a]^arr[b];
		
	}
	
	static void sortArray(int[] arr) {
		
		for(int i = 0 ; i< arr.length-1 ; i++) {
			boolean isFurtherSortingReq = false;
			for(int j = 0 ; j < arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					swap(arr, j, j+1);
					isFurtherSortingReq = true;
					
				}
				
				
				
			}
			if(!isFurtherSortingReq) return;
			
		}
		
		
	}

}
