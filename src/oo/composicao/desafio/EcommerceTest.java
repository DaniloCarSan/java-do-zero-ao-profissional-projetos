package oo.composicao.desafio;

public class EcommerceTest {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("SSD", 5.00);
		Produto p2 = new Produto("Processador R7 5700g", 5.00);
		Produto p3 = new Produto("Fan Rise mode 120mm RGB BLUE", 5.00);
		Produto p4 = new Produto("Asus tuf b550-m plus", 5.00);
		Produto p5 = new Produto("Memoria ram king fury dd4 3200 16gb", 5.00);
		
		Cliente cliente = new Cliente("Danilo Santos");
		
		Compra c1 = new Compra(1);
		c1.addItem(new Item(p1,1));
		c1.addItem(new Item(p2,1));
		
		Compra c2 = new Compra(2);
		c1.addItem(new Item(p3,1));
		c1.addItem(new Item(p4,1));
		c1.addItem(new Item(p5,1));
		
		cliente.compras.add(c1);
		cliente.compras.add(c2);
		
		System.out.println(cliente.totalGasto());
		
	}

}
