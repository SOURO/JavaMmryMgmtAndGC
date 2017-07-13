/**
 * 
 */
package com.souro.heapsizedetails;

/**
 * @author sourabrata
 *
 */
public class HeapSizeDetails1 {
	public static void main(String args[]){
		// Get current size of heap in bytes, the total amount of memory currently available for current and future objects, measured in bytes. 
		long currHeapSize = Runtime.getRuntime().totalMemory(); 

		// Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
		long maxHeapSize = Runtime.getRuntime().maxMemory();

		 // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
		long freeHeapSize = Runtime.getRuntime().freeMemory(); 
		
		System.out.println("Current Heap Size: " + currHeapSize);
		System.out.println("Max Heap Size: " + maxHeapSize);
		System.out.println("Currently Free Heap Size :" + freeHeapSize);
	}
}
