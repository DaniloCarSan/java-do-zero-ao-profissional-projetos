package classe;

public class DataTest {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.ano = 2023;
		d1.mes = 10;
		d1.dia = 25;
		
		Data d2 = new Data();
		d2.ano = 2024;
		d2.mes = 10;
		d2.dia = 25;
		
		System.out.printf("%d/%d/%d", d1.dia,d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
	
}
