package ejercicios;

import graphics.*;																//Con asterisco nos traemos todo el 
																				//paquete
public class P05PrimerosGraficos {

		public static void main(String[] args) throws InterruptedException {	//podemos separar la clase en tres
																				//partes bien diferenciadas
			
			Rectangle cuadrado;													//aqui es donde se crea las variables
			Ellipse circulo;													

			cuadrado = new Rectangle(0,0,100,100);								//luego se les da las cordenadas y
			circulo = new Ellipse(25,25,50,50);									//el tamaño para poderlas dibujar
			
			
			cuadrado.draw();													//primero se dibuja el cuadrado
			Thread.sleep(3000);													//se espera 3000 milisegundos 
			circulo.setColor(Color.BLUE);										//y le va a cambiar el color a azul
			circulo.draw();														//para dibujar el circulo
			
		//Para poder usar Thread.sleep(3000); tenemos que poner a continuacion del main throws InterruptedException
			
		}
	}