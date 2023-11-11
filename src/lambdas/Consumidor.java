package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> consumer = p -> System.out.println(p.nome);
		
		List<Produto> produtos = Arrays.asList(new Produto("Borracha",1.00), new Produto("Lapis",1.00), new Produto("Cola",8.50) );
		
		Produto p = new Produto("Caneta",1.50);

		consumer.accept(p);
		
		produtos.forEach(consumer);
		
	}

}
