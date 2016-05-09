package ed_list;

public class QueueImpl implements Queue {
	private List elements;
	
	public QueueImpl(){
		elements = new LinkedList();
	}
	
	public void enqueue(int value) { //adiciona na ultima posicao
		elements.insert(value, elements.size());
	}
	
	public int dequeue() {
		if(size() > 0){
			int value = elements.elementAt(0);
			elements.delete(0);
			return value;
		}
		else
			throw new InvalidArgumentException();
	}

	@Override
	public boolean isEmpty() {
		return (elements.size() == 0);
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public void clear() {
		for(int i = 0; i < size(); i++)
			dequeue();
	}

}
