package oo.herenca;

public class Jogador {
	
	int vida = 100;
	Coordenada coordenada;
	
	Jogador(Coordenada inicial){
		this.coordenada = inicial;
	}
	
	void atacar(Jogador oponente) {
		int deltaX = Math.abs(this.coordenada.x - oponente.coordenada.x);
		int deltaY = Math.abs(this.coordenada.y - oponente.coordenada.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
		} else if(deltaX == 1 && deltaY ==0) {
			oponente.vida -= 10;
		}
	}
	
	boolean andar(Direcao d, int n) {
		
		switch (d) {
		case TOP:
			this.coordenada.y += n;
			break;
		case BOTTOM:
			this.coordenada.y -= n;
			break;
		case LEFT:
			this.coordenada.x -= n;
			break;
		case RIGHT:
			this.coordenada.x += n;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + d);
		}
		
		return false;
	}
}
