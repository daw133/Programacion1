package ejercicios;

import java.util.Scanner;

public class E03Coordenadas {

	//Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
	
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		int base,altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe x1,x2,y1,y2: ");
		x1=teclado.nextInt();
		x2=teclado.nextInt();
		y1=teclado.nextInt();
		y2=teclado.nextInt();
		
		base=Math.abs(x2-x1);   //Math.abs(x2-x1) devuelve el valor absoluto, se calcula la base con una resta
		altura=Math.abs(y2-y1); //Igual que antes, se podria simplificar haciendolo altura=(y2-y1); pero en caso
								//de introducir numeros negativos daria error

		System.out.printf("El rectángulo (%d,%d)(%d,%d)\n\ttiene una"
		 + " altura de %d\n\ty una base de %d,\n\ty un área de %d.",
		 x1,x2,y1,y2,altura,base,base*altura);
		
		//con printf se puede dar formato a los datos de salida, % significa que despueds de las comillas iremos
		//introduciendo las variables en orden, d significa que el numero es entero, \n significa que daremos un
		//salto de linea y \t tabulaciones 
	}
}