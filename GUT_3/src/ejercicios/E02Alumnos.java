package ejercicios;

import java.util.Scanner;
import ejercicios.P01Alumno;

public class E02Alumnos {									//este ejercicio tendria sentido con mas datos
															//lo unico que hacemos es vamos introduciendo datos que se
	public static void main(String[] args) {				//van a guardar en P01Alumno y desde ahi gracias a los 
		P01Alumno alumno1,alumno2,alumno3;					//setter nos los vamos trayendo, aqui no se guarda nada
		Scanner teclado = new Scanner(System.in);			//de informacion, se crea y se manda hacia P01Alumno y 
		String nombre;										//este cuando tu lo necesitas te lo devuelve
		int edad;
		
		alumno1 = new P01Alumno();
		System.out.print("Nombre del primer alumno: ");
		nombre =  teclado.nextLine();
		alumno1.setNombre(nombre);
		System.out.print("Edad de los alumnos: ");
		edad =  teclado.nextInt();
		alumno1.setEdad(edad);
		
		alumno2=new P01Alumno();
		System.out.print("Nombre del segundo alumno: ");
		teclado.nextLine();
		alumno2.setNombre(teclado.nextLine());
		alumno2.setEdad(edad);
		
		alumno3=new P01Alumno();
		System.out.print("Nombre del segundo alumno: ");
		alumno3.setNombre(teclado.nextLine());
		alumno3.setEdad(edad);
		
		System.out.println("Listado de alumnos");
		System.out.println("Nombre\tEdad");
		System.out.println(alumno1.nombre + "\t" + alumno1.edad);
		System.out.println(alumno2.nombre + "\t" + alumno2.edad);
		System.out.println(alumno3.nombre + "\t" + alumno3.edad);
		
		
	}

}
