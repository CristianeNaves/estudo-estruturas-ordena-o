package ed_test;


import ed_list.HashTable;
public class HashTableTest {
	
	public static void main(String[] args){
		
		int m = 13;

			HashTable hash = new HashTable(m);
			
				hash.insert(100, 42);
			
			
			hash.Find(100).show();

	
	
	}
}
