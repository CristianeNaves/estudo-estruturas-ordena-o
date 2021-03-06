package ed_list;

public class StackImpl implements Stack {
	private List elements;
	public StackImpl(){
		elements = new LinkedList();
	}
	
	public void push(int value) {
		elements.insert(value, elements.size());
	}

	public int pop() {
		int value = elements.elementAt(elements.size() - 1);
		elements.delete(elements.size() - 1);
		return value;
	}

	public int top() {
		return elements.elementAt(elements.size() - 1);
	}

	public boolean isEmpty() {
		return (elements.size() == 0);
	}

	public int size() {
		return elements.size();
	}

	public void clear() {
		for(int i = 0; i < elements.size(); i++)
			pop();
	}

}
