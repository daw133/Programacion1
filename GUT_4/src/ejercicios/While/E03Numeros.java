package ejercicios.While;

import java.util.Scanner;

public class E03Numeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroLeido, numerosLeidos = 0, primerNumero = 0;

		System.out
				.println("Introduce numero, si introduces un n�mero negativo, el programa parar�:");
		numeroLeido = teclado.nextInt();
		numerosLeidos++;
		primerNumero=numeroLeido;
		
		while (numeroLeido >= 0) {
			
			numerosLeidos++;
			System.out
					.println("Introduce otro numero, si introduces un n�mero negativo, el programa parar�:");
			numeroLeido = teclado.nextInt();

			if (numeroLeido < 0) {
					System.out.println("\nEl n�mero es negativo. Fin del programa.");
			}
		}	
		System.out.println("El primer n�mero fue el:" + primerNumero);
	}
}