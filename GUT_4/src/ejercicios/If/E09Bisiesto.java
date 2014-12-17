package ejercicios.If;

import java.util.Scanner;

public class E09Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int año;
		boolean esBisiesto;

		System.out.println("Introduzca el año ");
		año = teclado.nextInt();

		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			esBisiesto = true;
		} else
			esBisiesto = false;

		if (esBisiesto)
			System.out.println("El año introducido es bisiesto");
		else
			System.out.println("El año introducido no es bisiesto");
	}
}