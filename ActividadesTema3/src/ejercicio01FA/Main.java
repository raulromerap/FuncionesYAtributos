package ejercicio01FA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		double n1, n2, resultado = 0;

		// Muestra el menu
		opc = menu();
		if (opc == 0) {
			System.out.println("Gracias por usar este programa");
		} else {
			// Pide un numero a los usuario
			n1 = pideNumero();
			n2 = pideNumero();

			Operaciones op = new Operaciones(n1, n2);

			switch (opc) {
			case 1 -> resultado = op.suma();
			case 2 -> resultado = op.resta();
			case 3 -> resultado = op.multi();
			case 4 -> resultado = op.div();
			case 5 -> resultado = op.max();
			case 6 -> resultado = op.min();
			}
			System.out.println("El resultado es: " + resultado);
		}
		sc.close();
	}

	public static int menu() {

		int opc;

		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
		System.out.println("0.Salir");

		opc = sc.nextInt();

		return opc;
	}

	public static double pideNumero() {

		double num = 0;
		boolean sigue = true;

		do {
			try {
				System.out.print("Introduzca un número: ");
				num = sc.nextDouble();
				sigue = false;
			} catch (InputMismatchException e) {
				System.out.println("El tipo de numero debe ser decimal");
			} finally {
				sc.nextLine();
			}
		} while (sigue);

		return num;
	}

}
