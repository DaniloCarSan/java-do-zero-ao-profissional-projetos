package classe;

public class Data {
	
	int ano;
	int mes;
	int dia;
	
	Data() {
		//this.dia = 1;
		//this.mes = 1;
		//this.ano = 1970;
		
		this(1,1,1970);
	}
	
	Data(int dia1, int mes1, int ano1) {
		this.dia = dia1;
		this.mes = mes1;
		this.ano = ano1;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
