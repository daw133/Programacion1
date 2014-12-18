package ejercicios;

import java.util.Scanner;

public class E04MinMax {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int[] numeros;
		int valor=100;
		boolean continuar = true;
		numeros=new int[40];
		
			for(int i=0;i<numeros.length;i++) {
				while(continuar) {
				numeros[i]=teclado.nextInt();
				System.out.println(numeros[i]);
			
			if (numeros[i] == 0){
				continuar = false;
				}
			}
		}
		System.out.println("Has salido del programa");

		
		int minimo;
		minimo=numeros[0];
		for(int i=1;i<5;i++) {
			if (numeros[i]<minimo) minimo=numeros[i];
		}
		
		System.out.println("numero de valores del Array " + numeros.length);
		System.out.println("El mínimo es: " + minimo);
		
		

	}

}