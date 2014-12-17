package ejercicios.Graficos;

import graphics.Color;
import graphics.Ellipse;

public class E03Diana {

	public static void main(String[] args) throws InterruptedException {

		Ellipse diana;
		
			for (int j = 0; j < 100; j++){
				Color colorAleatorio;
				colorAleatorio = new Color ((int) (Math.random() * (255 - 0)),
	   										(int) (Math.random() * (255 - 0)),
	   										(int) (Math.random() * (255 - 0)));
				diana= new Ellipse (0 + (j * 10), 0 + (j * 10), 500 - (j * 20), 500 - (j * 20));
				diana.setColor(colorAleatorio);
				diana.draw();
		}
	}
}