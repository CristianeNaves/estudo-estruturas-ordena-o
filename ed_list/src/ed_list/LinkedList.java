package ed_list;


class LinkedNode{
	int item;
	LinkedNode next;
	
	public LinkedNode(int item, LinkedNode next){
		this.item = item;
		this.next = next;
	}
	public LinkedNode(int item){
		this.item = item;
		this.next = null;
	}
	public LinkedNode(){
		next = null;
	}
}
public class LinkedList implements List{
	public LinkedNode head;
	public int size;
	public int pos;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	public void insert(int item, int pos){
		if(pos > size  || pos < 0)
			throw new InvalidArgumentException();
		else{
			if(size == 0){
				head = new LinkedNode(item);
			}
			else if(pos == 0){
				head = new LinkedNode(item, head);
			}
			else{
				LinkedNode temp = head;
				for(int i = 0; i < pos - 1; i++){
					temp = temp.next;
				}
				temp.next = new LinkedNode(item, temp.next);
			}
			size++;
		}
		
	}
	public void delete(int pos){
		if(pos < 0 || pos >= size)
			throw new InvalidArgumentException();
			
		if(pos == 0){
			head = head.next;
		}
		else{
			LinkedNode temp = head;       
			for(int i = 0; i < pos - 1; i++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		size--;
			
	}
		
	public int elementAt(int pos){
		if(pos < 0 || pos >= size){
			throw new InvalidArgumentException();
		}
		else{
			LinkedNode t = head;
			for(int i = 0; i < pos; i++){
				t = t.next;
			}
			return t.item;
		}
	}

	public int find(int value) {
		LinkedNode temp = head;
		for(int i = 0; i < size; i++) {
			if(temp.item == value){
				return i;
			}
			temp = temp.next;
		}
		throw new InvalidArgumentException();
	}
	
	public int size(){
		return size;
	}
	
	public void show(){
		for(int i = 0; i < size; i++){
			System.out.println(elementAt(i));
		}
			
	}
	public void troca(int i, int j){
		
		
		/*int tempI = elementAt(i);
		int tempJ = elementAt(j);
		delete(i);
		delete(j);
		insert(tempI, j);
		insert(tempJ, i);
		arrumar esse codigo para funcionar para mais posicoes
		*/
		
	}

}
