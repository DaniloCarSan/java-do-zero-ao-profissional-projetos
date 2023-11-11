package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuradrado = n -> n * n;
		
		Integer r = maisDois
				.andThen(vezesDois)
				.andThen(aoQuradrado)
				.apply(2);
		
		System.out.println(r);
		
		r = aoQuradrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(2); 
		
		System.out.println(r);
		
	}

}
