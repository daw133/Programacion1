package ejercicios.Switch;

import java.util.Scanner;

public class E01DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia;
		System.out.print("Dame el día de la semana (en número): ");
		numero_dia = teclado.nextInt();
		
		switch (numero_dia) {
		case 1:
			letra_dia = "Lunes";
			break;
		case 2:
			letra_dia = "Martes";
			break;
		case 3:
			letra_dia = "Miercoles";
			break;
		case 4:
			letra_dia = "Jueves";
			break;
		case 5:
			letra_dia = "Viernes";
			break;
		case 6:
			letra_dia = "Sabado";
			break;
		case 7:
			letra_dia = "Domingo";
			break;
		default:
			System.out.println("El número no está entre [1..7]");
			letra_dia = "Error";
			break;
		}
		if (!letra_dia.equals("Error")) {
			System.out.println("El día " + numero_dia + " corresponde al "
					+ letra_dia);
		}
	}

}
