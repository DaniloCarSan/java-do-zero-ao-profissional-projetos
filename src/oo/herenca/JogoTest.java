package oo.herenca;

public class JogoTest {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador(new Coordenada(10,10));
		
		j1.andar(Direcao.RIGHT, 10);
		
		System.out.println(j1.coordenada.x);
	}

}
