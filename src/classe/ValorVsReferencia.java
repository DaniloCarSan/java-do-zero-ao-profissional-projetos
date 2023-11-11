package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
	
		//atribuição por valor
		double a = 1;
		double b = a;
		b = 5;

		System.out.println(a);
		System.out.println(b);
		
		
		// atribuição por referência
		Data d1 = new Data();
		d1.ano = 2023;
		d1.mes = 10;
		d1.dia = 1;
		
		System.out.printf("%d/%d/%d\n", d1.dia,d1.mes, d1.ano);
		
		Data d2 = d1;
		d2.dia = 31;
		
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		
	}
	
}
