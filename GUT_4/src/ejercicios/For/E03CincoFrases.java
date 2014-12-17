package ejercicios.For;

import java.util.Scanner;

public class E03CincoFrases {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		String leido;
		
		for(int i=5;i>0;i--) {
			System.out.println("Introduzca " + i + " frases");
			leido=teclado.nextLine();
			System.out.println(leido);
		}
		
		/*for(int i=5;i>0;i--) {
			leido=teclado.nextLine();
			System.out.println(leido);
		}
		*/
		
	}
}