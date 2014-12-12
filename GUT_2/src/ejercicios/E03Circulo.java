package ejercicios;

import java.util.Scanner;

public class E03Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double radio;
       
        System.out.println("Vamos a calcular el per�metro y el �rea de un c�rculo. "
        		+ "\nIntroduce el valor de su radio: ");
        radio=teclado.nextDouble();
       
        double per�metro;
        double area;
        
        per�metro=2*Math.PI*radio;		   	    //Math.PI es el valor de Pi
        area=Math.PI * Math.pow(radio, 2);		//Math.pow(radio, 2) es la forma de hacer el cuadrado de radio
        System.out.println("Vale, el valor de su radio es "
          + radio 
          + "\npor lo tanto el �rea del c�rculo es "
          + area
          + "\nsu per�metro es "
          + per�metro);

        System.out.printf("El �rea es %.2f y su per�metro es %.2f", //con %.2f solo te muestra dos decimales
        		area,per�metro);

	}
}