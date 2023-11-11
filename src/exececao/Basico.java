package exececao;

import streams.Aluno;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a = null;
		
		try {
		imprimirAluno(a);
		
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(7/ 0);
		
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
