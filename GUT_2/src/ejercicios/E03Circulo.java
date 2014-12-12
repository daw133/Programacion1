package ejercicios;

import java.util.Scanner;

public class E03Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double radio;
       
        System.out.println("Vamos a calcular el perímetro y el área de un círculo. "
        		+ "\nIntroduce el valor de su radio: ");
        radio=teclado.nextDouble();
       
        double perímetro;
        double area;
        
        perímetro=2*Math.PI*radio;		   	    //Math.PI es el valor de Pi
        area=Math.PI * Math.pow(radio, 2);		//Math.pow(radio, 2) es la forma de hacer el cuadrado de radio
        System.out.println("Vale, el valor de su radio es "
          + radio 
          + "\npor lo tanto el área del círculo es "
          + area
          + "\nsu perímetro es "
          + perímetro);

        System.out.printf("El área es %.2f y su perímetro es %.2f", //con %.2f solo te muestra dos decimales
        		area,perímetro);

	}
}