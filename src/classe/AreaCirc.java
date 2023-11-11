package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raio1) {
		this.raio = raio1;
	}
	
	double area() {
		return PI * Math.pow(this.raio, 2);
	}

}
