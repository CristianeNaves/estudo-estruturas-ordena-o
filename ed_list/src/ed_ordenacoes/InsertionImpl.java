package ed_ordenacoes;

import ed_list.List;


public class InsertionImpl implements AbstractSort {
	
	public List ordena(List list){
		
		for(int i = 1; i < list.size(); i++){
			if(list.elementAt(i) < list.elementAt(i - 1)){
				list.troca(i, i - 1);
				for(int j = i - 1; j > 0; j--){
					if(list.elementAt(j) < list.elementAt(j - 1))
						list.troca(j - 1, j);
					else
						break;
				}
			}
		}
		
		return list;
	}

}


