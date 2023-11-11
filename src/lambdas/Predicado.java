package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> prod.preco > 3000;
		
		Produto p = new Produto("Notebook", 3500);
		
		System.out.println(isCaro.test(p));
		
		p = new Produto("Notebook", 2900);
		
		System.out.println(isCaro.test(p));
	}
}
