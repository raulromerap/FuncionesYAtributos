package ejercicio02FA;

public class Rectangulo {

	double alto, ancho;

	public Rectangulo() {

	}

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public double perimetro() {
		return (alto * 2) + (ancho * 2);
	}

	public double area() {
		return alto * ancho;
	}
}
