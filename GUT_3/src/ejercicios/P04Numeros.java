package ejercicios;

import java.util.Scanner;

public class P04Numeros {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int n;
		System.out.println("Introduce un numero para ver si es negativo");		
		n=teclado.nextInt();
		
		if (n<0) {
			System.out.println("N�mero negativo");
		} else {
			System.out.println("N�mero positivo o 0");
		}
		
		System.out.println("Fin.");

	}

}