package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (a, b) -> { return a + b; };

		System.out.println(calculo.apply(3.0,2D));
		
		calculo = (a, b) -> a * b ;
		
		System.out.println(calculo.apply(3.0,2D));
		
	}

}
