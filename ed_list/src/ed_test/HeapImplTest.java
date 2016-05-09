package ed_test;


import ed_list.HeapImpl;
import junit.framework.TestCase;

public class HeapImplTest extends TestCase {

    public HeapImpl Heap;
	
	public void setUp() {
		Heap = new HeapImpl();
	}
	
	public void testInit() {
		assertEquals(0, Heap.size());
	}
	public void testEnqueue(){
		Heap.enqueue(42);
		Heap.enqueue(1);
		Heap.enqueue(7);
		assertEquals(3, Heap.size());
		Heap.enqueue(100);
		Heap.show();
	}
	public void testDequeue(){
		Heap.enqueue(100);
		Heap.enqueue(42);
		Heap.enqueue(7);
		Heap.enqueue(1);
		int t = Heap.dequeue();
		assertEquals(100, t);
		Heap.show();
	}
	public void testMaxHeapify(){
		Heap.enqueue(16);
		Heap.enqueue(4);
		Heap.enqueue(10);
		Heap.enqueue(14);
		Heap.enqueue(7);
		Heap.enqueue(9);
		Heap.enqueue(3);
		Heap.enqueue(2);
		Heap.enqueue(8);
		Heap.enqueue(1);
		Heap.show();
	}
}
