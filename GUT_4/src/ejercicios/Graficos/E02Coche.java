package ejercicios.Graficos;

import graphics.*;

public class E02Coche {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado, cuadrado1;
		Ellipse rueda1, rueda2;
		int ancho = 90;

		cuadrado=new Rectangle(75,130,100,50);
		cuadrado1=new Rectangle(25,180,200,50);
		rueda1=new Ellipse(25,200,50,50);
		rueda2=new Ellipse(175,200,50,50);

		cuadrado.setColor(Color.RED);
		cuadrado.fill();
		cuadrado1.setColor(Color.GRAY);
		cuadrado1.fill();
		rueda1.setColor(Color.BLACK);
		rueda1.fill();
		rueda2.setColor(Color.BLACK);
		rueda2.fill();
		
		int mover = 5;
		while (true) {
			for (int i = 0; i < 45; i++) {
				Thread.sleep(50);
				cuadrado.translate(mover, 0);
				cuadrado1.translate(mover, 0);
				rueda1.translate(mover, 0);
				rueda2.translate(mover, 0);
				System.out.println(i);

				if (i==44) mover=-mover;
			}

		}

	}

}
