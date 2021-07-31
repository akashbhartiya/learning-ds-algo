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
	
	

}
