package ejercicios;

import java.util.Scanner;

public class E02SumaDos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.println("Introduce el primer n�mero: "); //Se introduce la primera variable, primero con una
		numero1 = teclado.nextInt();						//linea de texto para saber lo que tenemos que meter

		System.out.println("Vale, tu primer n�mero es: " + numero1
				+ ". \n\nAhora introduce tu segundo n�mero: ");	//las \n es una linea nueva

		numero2 = teclado.nextInt(); //(int) teclado.nextLong(); asi podriamos pasar a un long si es muy largo

		int suma=(numero1 + numero2);
		int multiplicacion = numero1 * numero2;
		double media=(numero1 + numero2) / 2;   //tambien podriamos usar float
												//Con ((double)numero1 + numero2) se convierte el numero 1
												//un double
		System.out.println("Vale, tu segundo n�mero ha sido " + numero2
				+ ", entonces:\nLa suma de los dos es " + suma 
				+ " ,\nsu producto es " + multiplicacion + "\ny su media es "
				+ media);
	}

}
