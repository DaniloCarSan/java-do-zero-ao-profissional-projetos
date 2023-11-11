package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final long id;
	List<Item> itens = new ArrayList<>();
	
	
	Compra(long id){
		this.id = id;
	}
	
	void addItem(Item item) {
		this.itens.add(item);
	}
	
	double total() {
		
		double total = 0;
		
		for(Item i : this.itens) {
			total += i.total();
		}
		
		return total;
	}
	
	
}
