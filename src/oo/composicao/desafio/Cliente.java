package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	
	double totalGasto(){
		double total= 0;
		
		for(Compra c: this.compras) {
			total += c.total();
		}
		
		return total;
	}

}
