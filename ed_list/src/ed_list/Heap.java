package ed_list;

public interface Heap {
	public boolean isEmpty();
	public void enqueue(int value);
	public int dequeue();
	public int size();
}