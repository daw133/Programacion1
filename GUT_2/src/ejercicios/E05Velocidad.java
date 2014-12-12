package ejercicios;

import java.util.Scanner;

public class E05Velocidad {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño;
        int velocidad;
        int transferencia;
        int tamañoBits;
        int Mbytebit=1048576; //(((1024)*1024)*8)
       
        System.out.println("Introduzca el peso del archivo (MBytes): ");
        tamaño = teclado.nextInt();
       
        System.out.println("Introduzca la velocidad (Mbps): ");
        velocidad = teclado.nextInt();
       
        tamañoBits = (tamaño * (Mbytebit * 8)); //para pasarlo de MBytes a KBytes, despues a Bytes y Bits
        transferencia =( tamañoBits / (velocidad * Mbytebit)); //se le añadiria un double si algo fuese decimal
       
        System.out.println("El archivo se transmite en " + transferencia + " segundos.");
        
	}

}
