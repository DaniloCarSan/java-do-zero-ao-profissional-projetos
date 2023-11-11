package streams;

public class Media {
	
	private double total;
	private int quantidade;

	public Media adicionar(double valor) {
		this.total += valor;
		this.quantidade++;
		return this;
	}
	
	public double getValor() {
		return this.total / this.quantidade;
	}
	
	public static Media combinar(Media ...medias) {
		Media resultante = new Media();
		
		for (Media media : medias) {
			resultante.total += media.total;
			resultante.quantidade += media.quantidade;
		}
		
		return resultante;
	}
}
