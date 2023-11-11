package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nome1) {
		this.nome = nome1;
	}
	
	public double precoComDesconto() {
		return this.preco * ( 1 - desconto);
	}

}
