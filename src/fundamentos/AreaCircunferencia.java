package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		int raio = 3;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 34;
		
		area = PI * raio * raio;
		
		System.out.println("Área = "+area);
		
	}

}
