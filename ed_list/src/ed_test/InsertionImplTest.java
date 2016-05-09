package ed_test;  

import ed_list.List;
import ed_ordenacoes.InsertionImpl;
import junit.framework.TestCase;
import ed_list.ArrayList;

import java.util.Random;
public class InsertionImplTest extends TestCase {
	public void testOrdena(){
		List lista = new ArrayList();
		InsertionImpl sort = new InsertionImpl();
		Random numAleatorio = new Random();
		for(int i = 0; i < 10; i ++){
			lista.insert(numAleatorio.nextInt(100), i);
		}
		lista.show();
		sort.ordena(lista);
		lista.show();
	}
	

}
