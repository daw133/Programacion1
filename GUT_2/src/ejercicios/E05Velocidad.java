package ejercicios;

import java.util.Scanner;

public class E05Velocidad {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tama�o;
        int velocidad;
        int transferencia;
        int tama�oBits;
        int Mbytebit=1048576; //(((1024)*1024)*8)
       
        System.out.println("Introduzca el peso del archivo (MBytes): ");
        tama�o = teclado.nextInt();
       
        System.out.println("Introduzca la velocidad (Mbps): ");
        velocidad = teclado.nextInt();
       
        tama�oBits = (tama�o * (Mbytebit * 8)); //para pasarlo de MBytes a KBytes, despues a Bytes y Bits
        transferencia =( tama�oBits / (velocidad * Mbytebit)); //se le a�adiria un double si algo fuese decimal
       
        System.out.println("El archivo se transmite en " + transferencia + " segundos.");
        
	}

}
