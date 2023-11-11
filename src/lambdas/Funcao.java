package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Produto, Double> function = p -> p.preco + p.preco * 0.1;
		
		List<Produto> produtos = Arrays.asList(
				new Produto("Borracha",1.00), 
				new Produto("Lapis",1.00), 
				new Produto("Cola",8.50)
		);
		
		produtos.forEach(p->{
			System.out.println(function.apply(p));
		});
		
		
		System.out.println("------------------------------------------");
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Function<Integer,String> parOuImpar = num -> num % 2 == 0 ? "Par" :"Impar";
		
		nums.forEach(n->System.out.println(parOuImpar.apply(n)));
		
		
		System.out.println("------------------------------------------");
		
		Function<String,String> oResultado = v -> "O resultado é:"+ v;
		
		String r = parOuImpar.andThen(oResultado).apply(32);
		
		System.out.println(r);
		
	}

}
