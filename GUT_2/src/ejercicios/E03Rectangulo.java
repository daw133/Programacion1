package ejercicios;

import java.util.Scanner;

public class E03Rectangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base;
		int altura;

		System.out.println("Vamos a calcular el perímetro y el área de un rectángulo."
							+ "\nAhora introduce el valor de su base (A): ");
		base = teclado.nextInt();

		System.out.println("Vale, el valor (A) de su base, que has introducido es "
							+ base
							+ " , ahora introduce el valor de su altura (B): ");
		altura = teclado.nextInt();

		System.out.println("Vale, el valor de su altura (B) es " + altura
							+ ", por lo tanto el perímetro de tu rectángulo es "
							+ ((2 * base) + (2 * altura)) + " y su área es "
							+ (base * altura));
		}
}