package ejercicios.If;

import java.util.Scanner;

public class E08Autonomia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double tama�o, porcentaje, consumo, gasolina, kilometros;

		System.out.println("Introduzca el tama�o del dep�sito en litros :");
		tama�o = teclado.nextInt();
		System.out.println("Porcentaje del dep�sito que est� lleno :");
		porcentaje = teclado.nextInt();
		System.out.println("Consumo cada 100 kil�metros :");
		consumo = teclado.nextInt();

		porcentaje = porcentaje / 100;
		gasolina = tama�o * porcentaje;
		kilometros = (gasolina / (consumo / 100));

		System.out.println("Quedan " + kilometros + " kilometros de autonomia");

		if (kilometros < 30) {
			System.out.println("CUIDADO esta usted en reserva");
		}
	}
}