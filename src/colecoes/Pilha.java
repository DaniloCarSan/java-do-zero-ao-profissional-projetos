package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("Padr�es de Projeto");
		livros.push("Arquitetura Limpo");
		livros.push("C�digo Limpa");
		livros.add("O m�tico homen-m�s");
		livros.add("Domain Driven Design");
		livros.add("Refatora��o");
		livros.add("Go em a��o");
		livros.add("A linguagem de programa��o Go");
		
		for(String l : livros) {
			System.out.println(l);
		}
		
		System.out.println(livros);
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		livros.remove();
		System.out.println(livros);
		livros.poll();
		System.out.println(livros);
		livros.pop();
		System.out.println(livros);
		
		livros.size();
		livros.clear();
		livros.contains("Padr�es de Projeto");
		livros.isEmpty();
	}
}
