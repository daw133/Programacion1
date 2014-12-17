package ejercicios.If;

import java.util.Scanner;

public class E07Mayor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero1, numero2;

		System.out.print("Dame dos números: ");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();

		if (numero1 > numero2) {
			System.out.println("El número mayor es el primero");
		} else if (numero1 < numero2) {
			System.out.println("El número mayor es el segundo");
		} else {
			System.out.println("Los dos números son iguales");
		}
	}
}