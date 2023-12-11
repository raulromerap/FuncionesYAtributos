package ejercicio02FA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo las variables
		Rectangulo rectangulo;
		int opc;
		double ancho, alto, resultado = 0;

		ancho = pideAncho();
		alto = pideAlto();
		opc = menu();

		while (opc != 0) {
			// Pido los numeros

			rectangulo = new Rectangulo(alto, ancho);

			switch (opc) {
			case 1 -> resultado = rectangulo.perimetro();
			case 2 -> resultado = rectangulo.area();
			}

			System.out.println("El resultado es: " + resultado);
			ancho = pideAncho();
			alto = pideAlto();
			opc = menu();

		}
		System.out.println("Gracias por usar este programa");
	}

	public static int menu() {

		int opc;

		System.out.println("1.Perímetro");
		System.out.println("2.Área");
		System.out.println("0.Salir");

		opc = sc.nextInt();

		return opc;

	}

	public static double pideAncho() {

		double ancho = 0;
		boolean seguir = true;
		do {
			try {
				System.out.print("Introduca el ancho: ");
				ancho = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Tipo de valor erroneo");
			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return ancho;

	}

	public static double pideAlto() {

		double alto = 0;
		boolean seguir = true;
		do {
			try {
				System.out.print("Introduca el alto: ");
				alto = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Tipo de valor erroneo");
			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return alto;
	}
}
