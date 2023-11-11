package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("André"));
		usuarios.add(new Usuario("Fernando"));
		usuarios.add(new Usuario("Danilo"));
		usuarios.add(new Usuario("Silveton"));
		usuarios.add(new Usuario("Eduardo"));
		
		System.out.println(usuarios.get(2).nome);
		
		usuarios.remove(2);
		
		for(Usuario u : usuarios) {
			//System.out.println(u); // toString
			System.out.println(u.nome);
		}
	}

}
