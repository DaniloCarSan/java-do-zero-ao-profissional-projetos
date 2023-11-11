package oo.interfaces;

public class Ferrari implements Esportivo {
	
	private boolean turbo = false;

	@Override
	public void ligartTurbo() {
		this.turbo = true;
	}

	@Override
	public void desligarTurbo() {
		this.turbo = false;
	}

}
