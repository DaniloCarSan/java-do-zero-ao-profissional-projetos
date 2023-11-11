package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (Double n1 , Double n2) -> (n1 + n2) / 2;
		
		System.out.println(media.apply(8D, 5D));
		
		Function<Double, String> conceito = v -> v >= 7 ? "Aprovado": "Reprovado";
		
		BiFunction<Double, Double, String> r = (n1, n2) -> conceito.apply(media.apply(n1, n2));
		
		System.out.println(r.apply(8D, 5D));
		
	}

}
