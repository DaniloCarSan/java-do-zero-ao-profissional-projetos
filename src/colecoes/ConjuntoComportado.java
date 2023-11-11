package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>();
		TreeSet<String> lista = new TreeSet<>();
		
		lista.add("Danilo");
		lista.add("Clarisse");
		lista.add("Marcos");
		
		for(String nome : lista ) {
			System.out.println(nome);
		}
		
		System.out.println(lista);
	}
}
