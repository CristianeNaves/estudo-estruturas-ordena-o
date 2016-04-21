package ed_list;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	public LinkedList Slist;
	
	public void setUp() {
		Slist = new LinkedList();
	}
	
	/*
	 * Testa o estado inicial de uma lista. 
	 */
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
	//	Slist.insert(1, 4);
	//	assertEquals(4, Slist.size());
	//	Slist.insert(7, 5);
	//	assertEquals(4, Slist.size());
	}
	/*public void testDelete(){
		Slist.insert(4, 0);
		Slist.insert(2, 1);
		Slist.size();
		Slist.delete(0);
		Slist.size();
		Slist.delete(0);
		Slist.size();
	//	Slist.size();
	//	assertEquals(4, Slist.find(1));
		//Slist.show();
		//assertEquals(42, Slist.elementAt(4));
		//Slist.delete(4);
		//Slist.delete(3);
		//assertEquals(2, Slist.size());
		//Slist.show();
		
	}*/
	
	
	
	/*
	 * Testa a operacao de insercao em uma lista. 
	 */
	/*public void testInsert() {
		list.insert(0, 10);
		list.insert(1, 20);
		list.insert(2, 30);

		assertEquals(3, list.size());
		assertEquals(10, list.elementAt(0));
		assertEquals(20, list.elementAt(1));
		assertEquals(30, list.elementAt(2));
		
		assertEquals(0, list.find(10));
		assertEquals(1, list.find(20));
		assertEquals(2, list.find(30));
	
		list.insert(0, 5);
		assertEquals(4, list.size());
		assertEquals(5, list.elementAt(0));
		
		assertEquals(1, list.find(10));
		assertEquals(2, list.find(20));
		assertEquals(3, list.find(30));
		
		list.insert(2, 15);
		assertEquals(5, list.size());
		assertEquals(15, list.elementAt(2));
		
		assertEquals(0, list.find(5));
		assertEquals(1, list.find(10));
		assertEquals(2, list.find(15));
		assertEquals(3, list.find(20));
		assertEquals(4, list.find(30));
	
	}
	
	/*
	 * Testa a remocao dos elementos de uma lista. Note que o 
	 * metodo public void setUp() inicializa a lista antes 
	 * de cada metodo ser executado. 
	 */
	/*public void testRemove() {
		list.insert(0, 10);
		list.insert(1, 20);
		list.insert(2, 30);

		assertEquals(3, list.size());
		
		list.remove(1);
		
		assertEquals(2, list.size());
		
		assertEquals(0, list.find(10));
		assertEquals(1, list.find(30));
		assertEquals(-1, list.find(20));
		
		list.remove(0);
		assertEquals(1, list.size());
		assertEquals(-1, list.find(10));
		assertEquals(0, list.find(30));
		
		list.remove(0);
		assertEquals(0, list.size());
	}*/
}
