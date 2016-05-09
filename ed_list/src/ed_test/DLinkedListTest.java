package ed_test;

import ed_list.DLinkedList;
import junit.framework.TestCase;

public class DLinkedListTest extends TestCase {

	public DLinkedList Dlist;
	
	public void setUp() {
		Dlist = new DLinkedList();
	}
	
	public void testInit() {
		assertEquals(0, Dlist.size());
	}
	
	
	
	public void testInsert(){
		Dlist.insert(10, 0);
		assertEquals(1, Dlist.size());
		Dlist.insert(42, 0);
		assertEquals(2, Dlist.size());
		assertEquals(42, Dlist.elementAt(0));
		Dlist.insert(7, 2);
		assertEquals(7, Dlist.elementAt(2));
		Dlist.show();
	}
	
	
	
	
}