package ejercicios.For;

import java.util.Scanner;

public class E04SeisNumeros {
	public static void main(String[] args) {
		int num, i, acumulador;

		acumulador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 6 numeros y calcularemos la suma de todos ellos ");
		for (i = 6; i > 0; i--) {
			
			num = teclado.nextInt();
			acumulador += num;
			
			if(i > 0)
				System.out.println("Te faltan " + (i - 1) + " numeros");
		}
		System.out.println("La suma es " + acumulador);
	}
}