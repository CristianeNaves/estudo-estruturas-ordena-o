package ed_list;

public interface Queue {
	public void enqueue(int value);
	public int dequeue();
	public boolean isEmpty();
	public int size();
	public void clear();
}
