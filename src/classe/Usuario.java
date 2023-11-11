package classe;

import java.lang.Exception;

public class Usuario {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			return outro.nome.equals(nome) && outro.email.equals(email);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

}
