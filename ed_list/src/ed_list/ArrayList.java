package ed_list;

public class ArrayList implements List {
	
	
	public int max_size = 10;  
	public int size;
	
	public int[] item;
	
	public ArrayList(){ 
		size = 0;
		item = new int[max_size];
	}
	
	public void insert(int value, int pos) {
		/*
		 * Não tem mais espaço para adicionar elementos, passa o antigo vetor para o novo.
		 * */
		
		if(size == max_size){                                   
			int[] newVetor = new int[max_size + max_size];
			max_size = max_size + max_size;
			for(int i = 0; i < size; i++){  
				newVetor[i] = item[i];
			}
			item = newVetor;
		}
		
		else{
			for(int i = size - 1; i >= pos; i--){
				item[i + 1] = item[i];
			}
			item[pos] = value;
			size++;
		}
		
	}

	public void delete(int pos) {
		if(size > 0){
			for(int i = pos; i < size - 1; i++){
				item[i] = item[i + 1];
			}
			size--;
		}
		else{
			throw new InvalidArgumentException();
		}
			
	}

	public int find(int value) {
		for(int i = 0; i < size; i++){
			if(item[i] == value)
				return i;
		}
		throw new InvalidArgumentException();
	}

	public int elementAt(int pos) {
		if(pos < 0 || pos >= size){
			throw new InvalidArgumentException();
		}
		else
			return item[pos];
	}

	public int size(){
		return size;
	}
	public int max_size(){
		return max_size;
	}
	
	public void show(){
		for(int i = 0; i < size; i++){
			System.out.println(elementAt(i));
		}
		
	}
	public void troca(int i, int j){
		int temp = item[i];
		item[i] = item[j];
		item[j] = temp;
		
	}
}
