package ed_test;

import ed_list.CircularList;
import junit.framework.TestCase;

public class CircularTest extends TestCase {

	public CircularList Clist;
	
	public void setUp() {
		Clist = new CircularList();
	}
	
	public void testInit() {
		assertEquals(0, Clist.size());
	}
	
	
	
	public void testInsert(){
		Clist.insert(10, 0);
		Clist.insert(42, 1);
		Clist.insert(7, 2);
		assertEquals(10, Clist.elementAt(0));
		assertEquals(42, Clist.elementAt(1));
		assertEquals(7, Clist.elementAt(2));
		Clist.delete(1);
		Clist.show();
		
	}
	
	
	
	
}