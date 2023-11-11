package lambdas;

public class CalculoTest {
	
	public static void main(String[] args) {
		
		Calculo calculo  = new Soma();
		System.out.println(calculo.executar(3, 2));
		
		calculo = new Multiplicacao();
		
		System.out.println(calculo.executar(3, 2));
	}

}
