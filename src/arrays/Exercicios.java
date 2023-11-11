package arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 6.0;
		notasAlunoA[1] = 7.0;
		notasAlunoA[2] = 9.0;
		
		for (double d : notasAlunoA) {
			System.out.println(d);
		}
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double[] notasAlunoB = {8,3,6,9};
		
		for (double f : notasAlunoB) {
			System.out.println(f);
		}
		
	}

}
