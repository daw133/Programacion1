package ejercicios;

import ejercicios.P01Alumno;

public class P02ClaseDaw {

	public static void main(String[] args) {
		P01Alumno juan,pepe;
		
		juan = new P01Alumno();
		pepe = new P01Alumno();
		
		juan.nombre="Juan Perez";
		juan.edad = 27;
		juan.aumentarEdad(1);
		
		pepe.setNombre("Pepe Perez");		

	}

}
