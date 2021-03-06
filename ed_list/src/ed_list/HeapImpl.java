package ed_list;


public class HeapImpl implements Heap {

	int [] elements;    
	int size;
	int MAX;
	
	public HeapImpl(){
		size = 0;
		MAX = 100;
		elements = new int[MAX];
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public int parent(int i){
		return (i - 1)/2;
	}
	public int left(int i){
		return (2 * i) + 1;
	}
	public int right(int i){
		return (2 * i) + 2;
	}
	public void troca(int largest, int idx){
		int aux = elements[idx];
		elements[idx] = elements[largest];
		elements[largest] = aux;
	}
	public void maxHeapify(int idx){
		int largest = idx;
		int left = left(idx);
		int right = right(idx);
		
		if(left < size && elements[left] > elements[largest])
			largest = left;
		if(right < size && elements[right] > elements[largest])
			largest = right;
		if(largest != idx){
			troca(largest, idx);
			maxHeapify(largest);
		}
		
	}
	

	public void enqueue(int value) {
		elements[size] = value;
		int idx = size;
		int largest = parent(idx);
		while(elements[largest] < elements[idx]){
			troca(largest, idx);
			idx = largest;
			largest = parent(idx);
		}
		size++;
	}

	@Override
	public int dequeue() {
		int valor = elements[0];
		troca(0, size - 1);
		size --;
		maxHeapify(0);
		return valor;
	}

	public int size() {
		return size;
	}
	public void show(){
		for(int i = 0; i < size; i++){
			System.out.println(elements[i]);
		}
	}

}
