package ejercicios;

import graphics.*;

public class E03Euribor {

	public static void main(String[] args) {

		Rectangle a10, a11, a12, a13, a14, leyen;        //los cuatro primeras son las barras y luego la leyenda
		Line lineax, lineay; 							 //las lineas que marcan la x y la y
		Text b10; 										 //añadiendo la leyenda
		double euribor2014 = 0.337, euribor2013 = 0.543; //variables para calcular la variacion de una y otra variable

		lineax = new Line(20, 20, 20, 200);
		lineax.setColor(Color.BLACK);
		lineax.draw();


		lineay = new Line(20, 200, 200, 200);
		lineay.setColor(Color.BLACK);
		lineay.draw();

		int tamaño;
		tamaño = (int) ((180 / 1) * euribor2013);		   //Euribor2013
		a10 = new Rectangle(30, 200 - tamaño, 20, tamaño);
		a10.setColor(Color.ORANGE);
		a10.fill();

		tamaño = (int) ((180 / 1) * euribor2014);		    //Euribor2014
		a11 = new Rectangle(60, 200 - tamaño, 20, tamaño);  //como empieza a dibujar de arriba hacia abajo la segunda
		a11.setColor(Color.YELLOW);							//indicacion igual se calcula a base del euribor
		a11.fill();

		a12 = new Rectangle(90, 100, 20, 100);  			 //Prevision Euribor2015
		a12.setColor(Color.BLUE);
		a12.fill();

		a13 = new Rectangle(120, 90, 20, 110); 				 //Prevision Euribor2016
		a13.setColor(Color.GRAY);
		a13.fill();

		a14 = new Rectangle(150, 110, 20, 90);				 //Prevision Euribor2017
		a14.setColor(Color.RED);
		a14.fill();

		leyen = new Rectangle(20, 220, 180, 110);
		leyen.draw();
		leyen.setColor(Color.BLACK);

		a10 = new Rectangle(30, 230, 10, 10);
		a10.setColor(Color.ORANGE);
		a10.fill();
		b10 = new Text(45, 225, "Texto de la casilla b10"); //texto de la leyenda
		b10.draw();											//simpre que se haga algo de los graphics se tiene que
															//dibujar (draw) o rellenar (fill)
		a11 = new Rectangle(30, 250, 10, 10);				//si un rectangulo se rellena no hace falta dibujarle
		a11.setColor(Color.YELLOW);
		a11.fill();

		a12 = new Rectangle(30, 270, 10, 10);
		a12.setColor(Color.BLUE);
		a12.fill();

		a13 = new Rectangle(30, 290, 10, 10);
		a13.setColor(Color.GRAY);
		a13.fill();

		a14 = new Rectangle(30, 310, 10, 10);
		a14.setColor(Color.RED);
		a14.fill();
	}
}
