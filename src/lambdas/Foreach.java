package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia", "Clara","Joso","Pio");
		
		aprovados.forEach(nome->{
			System.out.println(nome);
		});
		
		
		aprovados.forEach(System.out::println);
		
		aprovados.forEach(nome->meuImprimir(nome));
		
		aprovados.forEach(Foreach::meuImprimir);
		
		Foreach.meuImprimir("BIry");
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Opa:"+ nome);
	}

}
