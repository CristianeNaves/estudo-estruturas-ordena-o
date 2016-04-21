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
public class LinkedList {
	public LinkedNode head;
	public int size;
	public int pos;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	public void insert(int item, int pos){
		if(pos > size  || pos < 0)
			System.out.println("posicao invalida");
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
			//	for(int i = 2; i < pos; i++){
				//	temp = temp.next;
			//	}
				//if(pos == size + 1)
			//		temp = new LinkedNode(item);
			//	else
				//	temp = new LinkedNode(item, temp);
			}
			size++;
		}
		
	}
	public void delete(int pos){
		if(pos < 0 || pos >= size)
			System.out.println("posicao invalida");
			
		if(pos == 0){
			head = head.next;
		}
		else{
			LinkedNode temp = head;       
			for(int i = 0; i < pos - 1; i++){
				temp = temp.next;
			}
			temp = temp.next;
			/*for(int i = 1; i < pos - 1; i++)
				temp = temp.next;
			if(pos < size){
				temp = temp.next;
			}
			if(pos == size)
				temp = null;
			*/
			
		}
		size--;
			
	}
		
	public int elementAt(int pos){
		LinkedNode t = head;
		System.out.println("t.item do head: " + t.item);
		for(int i = 0; i < pos; i++){
			t = t.next;
			System.out.println("t.item do t.next: " + t.item);
		}
		System.out.println("t.item depois que sair do loop:" + t.item);
		return t.item;
		
	}
/*	public int find(int valorPos){
		int i = 1;
		//fazer validações
		LinkedNode temp = head;
		while(temp.item != valorPos){
			System.out.println("entrei no while");
			temp = temp.next;
			i++;
		}
		return i;
	}*/
	public int find(int value) {
		LinkedNode temp = head;
		for(int i = 0; i < size; i++) {
			if(temp.item == value){
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	public int size(){
		System.out.println("tamanho: " + size);
		return size;
	}
	/*
	public void show(){
		LinkedNode t = head;
		for(int i = 1; i <= size; i++){
			System.out.println("estou aqui" +t.item);
			t = t.next;
		}
			
			//System.out.println(elementAt(i));
		
	}*/

}
