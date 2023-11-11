package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DesafioMaps {
	public static void main(String[] args) {
		
		/*
		 * 1 Numero para string binaria => "110"
		 * 2 Inverter string binaria => "110" => "011"
		 * 3 Converter de volta para inteiro => "011" 
		 * 
		 * Integer
		*/
		
		Function<Integer,String> numeroParaBinario = n -> Integer.toBinaryString(n);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String,Integer> binariaParaInteger = s -> Integer.parseInt(s,2);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> stream = nums.stream();
		
		stream.map(Integer::toBinaryString)
			  .map(inverter)
			  .map(inverter)
			  .map(binariaParaInteger)
			  .forEach(System.out::println);
		
	}
}
