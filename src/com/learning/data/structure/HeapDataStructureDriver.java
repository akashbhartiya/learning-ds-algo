package com.learning.data.structure;

public class HeapDataStructureDriver {

	public static void main(String[] args) {
		
		HeapDataStructure heap = new HeapDataStructure();
		int d[] = {-1};
		heap.data = d;
		heap.counter = d.length;
		
		heap.add(50);
		heap.add(30);
		heap.add(40);
		heap.add(10);
		heap.add(5);
		heap.add(20);
		heap.add(30);
		
		heap.add(55);
		
		System.out.println("=======================");

	}

}
