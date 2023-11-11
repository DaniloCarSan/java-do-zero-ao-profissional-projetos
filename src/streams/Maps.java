package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Maps {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ","AUDI ","FERRARI ");
		
		marcas.stream().map(v -> v.toLowerCase()).forEach(print);
		
		UnaryOperator<String> minuscula = n -> n.toLowerCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
		
		marcas.stream().map(minuscula).map(primeiraLetra).forEach(print);
	}
}
