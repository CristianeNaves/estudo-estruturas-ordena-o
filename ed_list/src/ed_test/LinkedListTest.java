package ed_test;

import ed_list.LinkedList;
import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	public LinkedList Slist;
	
	public void setUp() {
		Slist = new LinkedList();
	}
	
	public void testInit() {
		assertEquals(0, Slist.size());
	}
	
	
	
	public void testInsert(){
		Slist.insert(10, 0);
		Slist.insert(20, 1);
		Slist.insert(30, 2);
		assertEquals(3, Slist.size());
		assertEquals(30, Slist.elementAt(2));
		assertEquals(30, Slist.elementAt(2));
		Slist.insert(5, 1);
		assertEquals(4, Slist.size());
		assertEquals(10, Slist.elementAt(0));
		assertEquals(5, Slist.elementAt(1));
	}
	public void testDelete(){
		Slist.insert(2, 0);
		Slist.insert(3, 1);
		Slist.insert(4, 2);
		Slist.delete(1);
		assertEquals(2, Slist.size());
		assertEquals(4, Slist.elementAt(1));
		
		
	}
	public void testFind(){
		Slist.insert(2, 0);
		Slist.insert(3, 1);
		Slist.insert(4, 2);
		assertEquals(3, Slist.size());
		assertEquals(2, Slist.elementAt(0));
		assertEquals(0, Slist.find(2));
		assertEquals(2, Slist.find(4));
		Slist.show();
		Slist.troca(0, 2);
		
	}
	public void testTroca(){
		Slist.insert(2, 0);
		Slist.insert(3, 1);
		Slist.insert(4, 2);
		Slist.show();
		Slist.troca(0, 2);
		Slist.show();
	}
	
	
	
}
