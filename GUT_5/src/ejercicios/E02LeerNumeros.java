package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E02LeerNumeros {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] numeros;
		
		numeros=new int[10];
		
		for(int i=0;i<10;i++) {
			numeros[i]=teclado.nextInt();
		}
		
		System.out.println("Número leídos:");
		for(int i=0;i<10;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.print(Arrays.toString(numeros));
		System.out.println("\núltimo elemento: \n" + numeros[numeros.length-1]);
		System.out.println("numero de valores del Array \n" + numeros.length);
		
	}

}