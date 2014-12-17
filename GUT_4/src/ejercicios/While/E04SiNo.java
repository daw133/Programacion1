package ejercicios.While;

import java.util.Scanner;

public class E04SiNo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String respuesta;

		/*do {
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=teclado.nextLine();
			respuesta=respuesta.toLowerCase();							//lo convierte a minuscula
			if (!(respuesta.equals("n") || respuesta.equals("s")))
				System.out.println("Debes introducir 's' o 'n'");
		} while (!(respuesta.equals("n") || respuesta.equals("s")));
		*/
		
		while (true){
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=teclado.nextLine();
			respuesta=respuesta.toLowerCase();
			if (!(respuesta.equals("n") || respuesta.equals("s")))
				System.out.println("Debes introducir 's' o 'n'");
			else
				break;
		} 
		
		/*boolean esCorrecta=false;

		while (!esCorrecta){
			System.out.print("¿Quieres continuar [s/n]?: ");
			respuesta=teclado.nextLine();
			respuesta=respuesta.toLowerCase();
			if (respuesta.equals("n") || respuesta.equals("s"))
				esCorrecta=true;
			else
				System.out.println("Debes introducir 's' o 'n'");
			{
		*/
	}
}
