package com.learning.data.structure;

public class HeapDataStructure {
	
	int[] data = new int[10];
	int counter = 1;
	
	
	public void add(int num) {
        int counterLocal = counter;
		if (((counterLocal / data.length) * 100) > 80) {
			data = resizeArray();
		}

		data[counter++] = num;

		int parent = counterLocal>>1;

		while (parent > 0) {

			if(data[counterLocal]>data[parent]) {
				
				data[counterLocal] = data[counterLocal]^data[parent];
				data[parent] = data[counterLocal]^data[parent];
				data[counterLocal] = data[counterLocal]^data[parent];
				
			}
			else {
				return;
			}
			
			counterLocal = parent;
			parent = parent>>1;
			
		}


	}
	
	
	public int delete() {
		int deletedElement = -1;
		
		if(counter<=1) {
			return -1;
		}
		
		deletedElement = this.data[1];
		this.data[1] = this.data[this.counter-1];
		this.data[this.counter-1] = 0;
		this.counter = this.counter-1;
		
		int i = 1;
		
		while(i < counter) {
			
			int left = i*2;
			int right = (i*2) + 1;
			
			int toBeSwappedWith = -1;
			
			
			
		    toBeSwappedWith = this.data[left]>this.data[right]?left:right;
		    if(data[toBeSwappedWith] <= data[i]) {
		    	return deletedElement;
		    }
			
			

			data[toBeSwappedWith] = data[toBeSwappedWith]^data[i];
			data[i] = data[toBeSwappedWith]^data[i];
			data[toBeSwappedWith] = data[toBeSwappedWith]^data[i];
			
			i = toBeSwappedWith;
			
			
		}
		return deletedElement;
	}


	private int[] resizeArray() {
		int[] x = new int[data.length + 10];
		for(int i = 0; i< data.length;i++) {
			x[i] = data[i];
			
		}
		return x;
	}
	
	
	public void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = (i<<1) + 1 ;
        int right = (i<<1) + 2;
        
        if((left < size) && (arr[left] > arr[largest])) {
        	largest = left;
        }
        if((right < size) && (arr[right] > arr[largest])) {
        	largest = right;
        }
        
        if(largest != i) {
        	
        	arr[i] = arr[i]^arr[largest];
        	arr[largest] = arr[i]^arr[largest];
        	arr[i] = arr[i]^arr[largest];
        	
        	heapify(arr, size, largest);
        	
        }
        
		
		
	}


	public void heapSort(int[] arr) {
		
		int len = arr.length;
		
		for(int i = len/2 -1 ;i >= 0; i-- ) {
			this.heapify(arr, len, i);
			}
		
		for(int i = len-1 ;i>0 ; i--) {
			
			arr[0] = arr[0]^arr[i];
        	arr[i] = arr[0]^arr[i];
        	arr[0] = arr[0]^arr[i];
        	
        	this.heapify(arr, i , 0);
        	
			
			
		}
		
		
	}
	

}
