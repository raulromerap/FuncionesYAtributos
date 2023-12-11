package ejercicio03FA;

public class Circulo {

	double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double circunferencia() {
		return 2 * Math.PI * radio;
	}

	public double area() {
		return Math.PI * (Math.pow(radio, 2));
	}

}
