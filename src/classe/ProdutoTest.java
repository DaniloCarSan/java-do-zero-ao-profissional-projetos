package classe;

public class ProdutoTest {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Nebook");
		p1.preco = 3456.96;
		p1.desconto = 0.10;
		
		var p2 = new Produto("Caneta");
		p2.preco = 7.88;
		p2.desconto = 0.12;
		
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
	}

}
