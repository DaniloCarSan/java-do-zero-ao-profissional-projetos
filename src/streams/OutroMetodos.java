package streams;

import java.util.Arrays;
import java.util.List;

public class OutroMetodos {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("A",7.1);
		Aluno a2 = new Aluno("B",6.1);
		Aluno a3 = new Aluno("C",8.1);
		Aluno a4 = new Aluno("D",10);
		
		// duplicados de acordo com o hascode e equals
		Aluno a5 = new Aluno("A",7.1);
		Aluno a6 = new Aluno("B",6.1);
		Aluno a7 = new Aluno("C",8.1);
		Aluno a8 = new Aluno("D",10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distincs........");
		
		alunos.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("\nSkip/Limit -> paginação");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\nSkip/takeWhile  pega enquanto for mair se for menor para o loop");
		
		alunos.stream()
		.distinct()
		//.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	}

}
