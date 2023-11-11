package classe;

public class Equal {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Danilo Santos";
		u1.email = "danilocarsan@gmai.com";
		
		
		Usuario u2 = new Usuario();
		u2.nome = "Danilo Santos";
		u2.email = "danilocarsan@gmai.com";
		
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
