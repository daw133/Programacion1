package ejercicios.For;

import java.util.Scanner;

public class E05SumaEntreNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n1, n2, n3 = 0, suma;
		suma = 0;

		for (n1 = 1, n2 = 0; n1 > n2;) {
			System.out.println("Inserte un numero");
			n1 = teclado.nextInt();
			System.out.println("Inserte otro numero");
			n2 = teclado.nextInt();

			if (n1 > n2) {
				n3 = n1;
				n1 = n2;
				n2 = n3;

			}
		}

		for (; n1 <= n2; n1++) {
			suma += n1;

			if (n1 == n2) {
				System.out.println("La suma de todos los numeros desde el primer numero hasta el segundo es de "
								+ (suma));
			}
		}
	}
}
