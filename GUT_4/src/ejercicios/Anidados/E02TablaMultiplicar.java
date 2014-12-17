package ejercicios.Anidados;

import java.util.Scanner;

public class E02TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numerotabla = 0;
		do {
			System.out.println("Introduce el número de la tabla:");
			numerotabla = teclado.nextInt();

			if (numerotabla >= 1 && numerotabla <= 10) {
				
				for (int i = 1; i <= 10; i++) {
					System.out.println(numerotabla + " X " + i + " = "
							+ numerotabla * i);
				}
			} else {
				System.out.println("El numero no esta entre 1 y 10");
			}

		} while (numerotabla >= 1 && numerotabla <= 10);

	}

}
