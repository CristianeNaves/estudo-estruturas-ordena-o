package ed_list;


class DLinkedNode{
	DLinkedNode next;
	DLinkedNode prev;
	int value;
	
	public DLinkedNode(int value){
		this.value = value;
	}
	
	public int getValue(int value){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public DLinkedNode getNext(){
		return next;
	}
	public void setNext(DLinkedNode next){
		this.next = next;
	}
	public DLinkedNode getPrev(DLinkedNode prev){
		return prev;
	}
	public void setPrev(DLinkedNode prev){
		this.prev = prev;
	}
}




public class DLinkedList implements List{
	public int size;
	public DLinkedNode head;
	public DLinkedNode tail;
	
	public DLinkedList(){
		head = null;                                                   
		tail = null;                                                   
		size = 0;
	}
	
	public void insert(int value, int pos) {
		if(pos > size  || pos < 0)
			throw new InvalidArgumentException();
		else{
			DLinkedNode newNode = new DLinkedNode(value);
			if(size == 0){
				head = newNode;
				tail = newNode;
			}
			
			else if(pos == 0){
				newNode.setNext(head);
				head.setPrev(newNode);
				head = newNode;
			}
			else if(pos == size){   
				newNode.setPrev(tail);
				tail.setNext(newNode);
				tail = newNode;
			}
			else{
				DLinkedNode temp = head;
				for(int i = 0; i < pos - 1; i ++){
					temp = temp.next;
				}
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				newNode.setPrev(temp);
				newNode.getNext().setPrev(newNode);
				
			}
			
			size++;
			}
	}
	
	@Override
	public int find(int value) {
		DLinkedNode temp = head;
		for(int i = 0; i < size; i++){
			if(temp.value == value)
				return i;
			temp = temp.next;
		}
		throw new InvalidArgumentException();
	}

	
	public int elementAt(int pos) {
			if(pos < 0 || pos >= size){
				throw new InvalidArgumentException();
			}
			else{
				DLinkedNode t = head;
				for(int i = 0; i < pos; i++){
					t = t.next;
				}
				return t.value;
			}
		
	}


	public void delete(int pos) {
		if(pos < 0 || pos >= size)
			throw new InvalidArgumentException();
			
		if(pos == 0){
			head = head.next;
			if(size == 1)
				tail = tail.next;
		}
		else if(pos == size - 1){  
			tail = tail.prev;
		}
		else{
			DLinkedNode temp = head;
			for(int i = 0; i < pos - 1; i++){
				temp = temp.next;
			}
			temp.setNext(temp.getNext().getNext());
			temp.getNext().setPrev(temp);
		}
		size--;
	}

	

	public void show() {
		for(int i = 0; i < size; i++){
			System.out.println(elementAt(i));
		}
	}


	public int size() {
		return size;
	}

	@Override
	public void troca(int i, int j) {
		// TODO Auto-generated method stub
		/*
		 * Não foi utilizado nessa estrutura
		 */
	}
	
}