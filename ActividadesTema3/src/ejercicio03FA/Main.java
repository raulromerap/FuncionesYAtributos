package ejercicio03FA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo las variables
		Circulo circulo;
		double radio, resultado = 0;
		int opc;

		// Pido los numeros
		radio = pideRadio();
		opc = menu();

		circulo = new Circulo(radio);
		while (opc != 0) {

			switch (opc) {
			case 1 -> resultado = circulo.circunferencia();
			case 2 -> resultado = circulo.area();
			}

			System.out.println("El resultado es: " + resultado);
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

	public static double pideRadio() {

		double radio = 0;
		boolean seguir = true;
		do {
			try {
				System.out.print("Introduca el radio: ");
				radio = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Tipo de valor erroneo");
			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return radio;

	}
}
