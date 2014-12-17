package ejercicios.Anidados;

import java.util.Scanner;

public class E03PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String respuestamaquina = null;
		String continuar;
		String respuestausuario;
		
		System.out.println("Vamos a jugar a piedra papel o tijera\n"
							+ "¿Quieres jugar? [s/n]");
		continuar = teclado.next();
	
		while (continuar.equals("s")){
		
		 System.out.println("¿piedra, papel o tijera?");
		 respuestausuario = teclado.next();
		 System.out.println("Has puesto "+respuestausuario);
		 if(!(respuestausuario.equals("tijera") || respuestausuario.equals("papel") || respuestausuario.equals("piedra"))){
			 	System.out.println("Tu respuesta no es correcta, prueba otra vez");
			 	continue;}
		 	 
			
		 switch ((int) (Math.random() * 3 + 1)) {
				case 1:
					respuestamaquina = "piedra";
					break;
				case 2:
					respuestamaquina = "papel";
					break;
				case 3:
					respuestamaquina = "tijera";
				}		

			if (respuestamaquina.equals(respuestausuario))
				System.out.println("Has EMPATADO, porque "+ respuestamaquina + " y " + respuestausuario + " son iguales.");
			else {
				System.out.println("La maquina ha sacado " + respuestamaquina);
				if (respuestamaquina.equals("piedra")
					&& respuestausuario.equals("tijera")
					|| respuestamaquina.equals("papel")
					&& respuestausuario.equals("piedra")
					|| respuestamaquina.equals("tijera")
					&& respuestausuario.equals("papel"))
					System.out.println("La maquina ha ganado.");
				else
					System.out.println("La maquina ha perdido");
				
			}
			System.out.println("¿Quieres volver a jugar? [s/n]");
			continuar = teclado.next();
		}
	}
}
