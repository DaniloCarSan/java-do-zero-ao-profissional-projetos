package oo.composicao;

public class CompraTest {

	public static void main(String[] args) {
		
		Compra c = new Compra();
		c.cliente = "Danilo";
		
		c.itens.add(new Item("caneta",10,2.0));
		c.itens.add(new Item("cadero",1,23.0));
		
		System.out.println(c.itens.size());
		
		System.out.println(c.obterValorTotal());
	}
}
