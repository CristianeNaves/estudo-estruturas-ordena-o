package ed_list;


public interface List {
	
	public int find(int value);
	public int elementAt(int pos);   //colocar as excecoes quando possivel
	public void insert(int value, int pos);
	public void delete(int pos);
	public void troca(int i, int j);
	public void show();
}
