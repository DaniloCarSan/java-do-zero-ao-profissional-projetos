package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Ana","Bia","Gui","Ju");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("//Com iterator");
		Iterator<String> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
		
		System.out.println("//Com stream");
		Stream<String> stream = lista.stream();
		
		stream.forEach(System.out::println);
	}
}
