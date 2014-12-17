package ejercicios.If;

import java.util.Scanner;

public class E08Autonomia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double tamaño, porcentaje, consumo, gasolina, kilometros;

		System.out.println("Introduzca el tamaño del depósito en litros :");
		tamaño = teclado.nextInt();
		System.out.println("Porcentaje del depósito que está lleno :");
		porcentaje = teclado.nextInt();
		System.out.println("Consumo cada 100 kilómetros :");
		consumo = teclado.nextInt();

		porcentaje = porcentaje / 100;
		gasolina = tamaño * porcentaje;
		kilometros = (gasolina / (consumo / 100));

		System.out.println("Quedan " + kilometros + " kilometros de autonomia");

		if (kilometros < 30) {
			System.out.println("CUIDADO esta usted en reserva");
		}
	}
}