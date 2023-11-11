package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> printInt = System.out::print;
		
		Stream<String> langs = Stream.of("PHP ","GOLANG ","JAVA ","DART ","JAVASCRIPT ");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Rust ", "C# "};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1,2).forEach(print);
		
		//Stream.generate(()->"a").forEach(print);
		//Stream.iterate(0, n -> n + 2).forEach(printInt);
	}
}
