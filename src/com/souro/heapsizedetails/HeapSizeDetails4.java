/**
 * 
 */
package com.souro.heapsizedetails;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sourabrata
 *
 */
public class HeapSizeDetails4 {
	public static void main(String args[]){
		// Get current size of heap in bytes, the total amount of memory currently available for current and future objects, measured in bytes. 
		long currHeapSize = Runtime.getRuntime().totalMemory(); 

		// Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
		long maxHeapSize = Runtime.getRuntime().maxMemory();

		 // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
		long freeHeapSize = Runtime.getRuntime().freeMemory(); 
		
		System.out.println("Before creating any objects::\n");
		System.out.println("Current Heap Size: " + currHeapSize);
		System.out.println("Max Heap Size: " + maxHeapSize);
		System.out.println("Currently Free Heap Size :" + freeHeapSize);
		
		List<Object> objs = new ArrayList<Object>();
		for (int i = 0; i  <  10000000 /*Integer.MAX_VALUE*/ ; i++) objs.add(new Object());
		
		currHeapSize = Runtime.getRuntime().totalMemory();
		maxHeapSize = Runtime.getRuntime().maxMemory();
		freeHeapSize = Runtime.getRuntime().freeMemory();
		
		System.out.println("\n\nAfter creating many objects::\n");
		System.out.println("Current Heap Size: " + currHeapSize);
		System.out.println("Max Heap Size: " + maxHeapSize);
		System.out.println("Currently Free Heap Size :" + freeHeapSize);
		
		//Requesting GC for garbage collection
		System.gc();
		
		currHeapSize = Runtime.getRuntime().totalMemory();
		maxHeapSize = Runtime.getRuntime().maxMemory();
		freeHeapSize = Runtime.getRuntime().freeMemory();
		
		System.out.println("\n\nAfter requesting GC::\n");
		System.out.println("Current Heap Size: " + currHeapSize);
		System.out.println("Max Heap Size: " + maxHeapSize);
		System.out.println("Currently Free Heap Size :" + freeHeapSize);
		
		objs=null;
		//Requesting GC for garbage collection
		Runtime.getRuntime().gc();
		
		currHeapSize = Runtime.getRuntime().totalMemory();
		maxHeapSize = Runtime.getRuntime().maxMemory();
		freeHeapSize = Runtime.getRuntime().freeMemory();
		
		System.out.println("\n\nNullified the objects and then requesting GC::\n");
		System.out.println("Current Heap Size: " + currHeapSize);
		System.out.println("Max Heap Size: " + maxHeapSize);
		System.out.println("Currently Free Heap Size :" + freeHeapSize);
		
	}
	@Override
    // finalize method get called before garbage collector start collecting garbage
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collection is getting started !!");
    }
}
