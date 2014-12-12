package ejercicios;

import java.util.Scanner;

public class E03Esfera {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double radio;

		System.out
				.println("Vamos a calcular el volumen de una esfera. \nIntroduce el valor de su radio (r): ");
		radio = teclado.nextDouble();

		System.out.println("Vale, el valor (r) de su radio es " + radio
				+ ", por lo tanto su volumen es "
				+ (((4.0 / 3.0) * Math.PI) * Math.pow(radio, 3))); 
				//se calcula el valor del volumen simplemente con la formula matematica, no hay nada especial
				//las formulas se encuentran en E03Circulo
	}

}