package ed_test;

import ed_list.ArrayList;
import junit.framework.TestCase;

public class ArrayListTest extends TestCase {

	public ArrayList Alist;
	
	public void setUp() {
		Alist = new ArrayList();
	}
	
	public void testInit() {
		assertEquals(0, Alist.size());
	}
	
	public void testInsert(){
		Alist.insert(11, 0);
		Alist.insert(7, 1);
		Alist.insert(10, 2);
		assertEquals(3, Alist.size());
		assertEquals(11, Alist.elementAt(0));
		Alist.insert(42, 0);
		assertEquals(4, Alist.size());
		assertEquals(42, Alist.elementAt(0));		
		
	}	
	
	public void testDelete(){
		Alist.insert(2, 0);
		Alist.insert(3, 1);
		Alist.insert(4, 2);
		Alist.delete(0);
		assertEquals(4, Alist.elementAt(1));
		Alist.delete(0);
		Alist.delete(0);
		assertEquals(0, Alist.size());
	
		
	}
	
	
	public void testFind(){
		Alist.insert(2, 0);
		Alist.insert(42, 1);
		Alist.insert(4, 2);
		assertEquals(3, Alist.size());
		assertEquals(2, Alist.elementAt(0));
		assertEquals(0, Alist.find(2));
		assertEquals(2, Alist.find(4));
		Alist.show();
		Alist.troca(2, 0);
		Alist.show();
		
	}
	

}
