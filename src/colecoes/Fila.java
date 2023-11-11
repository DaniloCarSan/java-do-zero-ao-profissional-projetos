package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<String>();
		
		
		fila.add("Ana");
		fila.add("Danilo");
		fila.add("Gui"); // retorna bool
		fila.offer("Gui"); //lança exceção quando cheia
		
		System.out.println(fila.peek()); //retorna null fila vazia
		System.out.println(fila.element()); // lança uma execeção para fila vazia
		
		
		fila.size();
		fila.clear();
		fila.isEmpty();
		
		
		fila.add("Ana");
		fila.add("Danilo");
		fila.add("Paulo");
		System.out.println(fila.poll()); //retorna null fila vazia
		System.out.println(fila.remove()); // lança uma execeção para fila vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.contains(.)
	}

}
