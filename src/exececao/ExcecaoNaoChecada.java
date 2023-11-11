package exececao;

public class ExcecaoNaoChecada {
	
	public static void main(String[] args) {

		gerarErro1();
		
		try {
			gerarErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FIM");
	}
	
	// não checada
	static void gerarErro1() {
		throw new RuntimeException("message gerarErro1");
	}
	
	// checada
	static void gerarErro2()throws Exception {
		throw new Exception("message gerarErro2");
	}
}
