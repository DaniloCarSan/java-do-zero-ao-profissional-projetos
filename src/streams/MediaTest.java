package streams;

public class MediaTest {
	
	public static void main(String[] args) {
		
		Media m1 = (new Media()).adicionar(4).adicionar(10).adicionar(10);
		Media m2 = (new Media()).adicionar(6).adicionar(2).adicionar(9);
		
		Media m = Media.combinar(m1, m2);
		
		System.out.println(m.getValor());
	}

}
