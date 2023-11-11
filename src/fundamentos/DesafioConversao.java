package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sálario:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o segundo sálario:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o terceiro sálario:");
		String valor3 = entrada.next().replace(",", ".");
		
		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);
		Double numero3 = Double.parseDouble(valor3);
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println(media);
	}
}
