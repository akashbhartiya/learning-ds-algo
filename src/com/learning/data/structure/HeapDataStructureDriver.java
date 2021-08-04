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
		
		System.out.println("===========Heap Populated============");
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println("===========Heap Modified=============");


		int arrToBeHeap[] = {10,30,50,20,35,15};
		
		for(int i = arrToBeHeap.length/2-1;i >= 0; i-- ) {
		heap.heapify(arrToBeHeap, arrToBeHeap.length-1, i);
		}
		
		int arrToBeSorted[] = {60,86,1,54,5,72,9,2,88};
		heap.heapSort(arrToBeSorted);
		
		System.out.println("==========================================");
		
		
	}

}
