package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("Padrões de Projeto");
		livros.push("Arquitetura Limpo");
		livros.push("Código Limpa");
		livros.add("O mítico homen-mês");
		livros.add("Domain Driven Design");
		livros.add("Refatoração");
		livros.add("Go em ação");
		livros.add("A linguagem de programação Go");
		
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
		livros.contains("Padrões de Projeto");
		livros.isEmpty();
	}
}
