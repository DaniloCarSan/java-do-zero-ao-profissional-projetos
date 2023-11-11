package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtros {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Danilo",9.0),
				new Aluno("Antonio",8.0),
				new Aluno("Paulo",7.0),
				new Aluno("Antonio",7.0),
				new Aluno("Patricia",6.0)
		);
		
		Predicate<Aluno> aprovado =  aluno -> aluno.nota >=7;
		Function<Aluno, String> aprovadoMensagem = a -> "Aprovado: "+ a.nome + "\n";
		Predicate<Aluno> reprovado =  aluno -> aluno.nota <=7;
		Function<Aluno, String> reprovadoMensagem = a -> "Reprovado: "+ a.nome + "\n";
		
		alunos.stream().filter(aprovado).map(aprovadoMensagem).forEach(System.out::println);
		alunos.stream().filter(reprovado).map(reprovadoMensagem).forEach(System.out::println);
	}
}
