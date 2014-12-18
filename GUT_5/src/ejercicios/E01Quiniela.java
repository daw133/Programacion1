package ejercicios;

import java.util.Arrays;

public class E01Quiniela {

	public static void main(String[] args) {
		int[] quiniela=new int[6];
		int contador = 0;
		int aleatorio = 0;
		boolean está=false;
		
		while(contador<6) {
			
			aleatorio = (int) (Math.random() * 20 + 1);
		
			for(int j=0;j<contador;j++){
				if (aleatorio == quiniela[j]) está=true; 
				}
			
			if (!está) {
				quiniela[contador]=aleatorio;
				contador++;
				}	
		}
		System.out.println(Arrays.toString(quiniela));
	}
}