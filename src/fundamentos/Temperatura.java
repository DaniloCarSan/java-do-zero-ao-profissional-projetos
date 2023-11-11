package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32 ) x 5/9 = C
		
		double f = 10;
		final int x = 32;
		final double fator = 5/9.0;
		
		final double c = (f - x) * fator;
		
		System.out.println("Área:"+c);
		
		
		
	}
	
}
