package ed_list;
public class HashTable {
	int m;
	LinkedList[] array;
	
	public HashTable(int m){
		this.m = m;
		array = new LinkedList[m];
	}
	
	public int Hash(int Key){
		return Key % m;
	}
	
	public void insert(int Key, int value){
		int idx = Hash(Key);
		if(array[idx] == null){
			array[idx] = new LinkedList();
		}
		array[idx].insert(value, 0);
		
	}
	public LinkedList Find(int Key){
		int idx = Hash(Key);
		return array[idx];
		
	}
	public void Show(int idx){
			array[idx].show();
		
	}

}
