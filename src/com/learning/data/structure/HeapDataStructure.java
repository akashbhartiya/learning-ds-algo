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


	private int[] resizeArray() {
		int[] x = new int[data.length + 10];
		for(int i = 0; i< data.length;i++) {
			x[i] = data[i];
			
		}
		return x;
	}
	
	

}
