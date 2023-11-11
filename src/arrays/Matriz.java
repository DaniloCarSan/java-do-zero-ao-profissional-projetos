package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o total de alunos:");
		int totalAlunos = entrada.nextInt();
		
		System.out.println("Digite o total de notas por aluno:");
		int totalNotasAlunos = entrada.nextInt();
		
		double[][] notasTurma = new double[totalAlunos][totalNotasAlunos];
		
		double total = 0;
		for (int i = 0; i < notasTurma.length; i++) {
			System.out.printf("Digite as notas do aluno(%d)\n",i+1);
			for (int j = 0; j < notasTurma[i].length; j++) {
				System.out.printf("Digite a nota(%d):",j+1);
				notasTurma[i][j] = entrada.nextDouble();
				
				total+= notasTurma[i][j];
			}
		}
		
		double media = total / (totalAlunos * totalNotasAlunos);
		
		System.out.println(media);
		
		entrada.close();
	}

}
