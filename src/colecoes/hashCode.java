package colecoes;

import java.util.HashSet;

public class hashCode {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Danilo"));
		usuarios.add(new Usuario("Silveton"));
		usuarios.add(new Usuario("Eduardo"));
		
		System.out.println(usuarios.contains(new Usuario("Danilo")));
	}

}
