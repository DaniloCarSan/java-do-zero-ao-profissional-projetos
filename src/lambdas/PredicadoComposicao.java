package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<Integer> isTresDigitos = n-> n >= 100 && n <= 999;
		
		System.out.println(isPar.test(22));
		System.out.println(isPar.test(23));
		
		System.out.println("--------------------");
		
		System.out.println(isTresDigitos.test(23));
		System.out.println(isTresDigitos.test(238));
		
		System.out.println("--------------------");
		
		System.out.println(isPar.and(isTresDigitos).test(22));
		System.out.println(isPar.and(isTresDigitos).test(222));
		System.out.println(isPar.or(isTresDigitos).test(123));
	}

}
