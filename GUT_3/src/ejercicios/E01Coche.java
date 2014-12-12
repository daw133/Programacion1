package ejercicios;

import graphics.*;

public class E01Coche {

	public static void main(String[] args) {
		Rectangle cuadrado, cuadrado1;
		Ellipse rueda;
		Ellipse rueda1;

		cuadrado=new Rectangle(75,130,100,50);
		cuadrado1=new Rectangle(25,180,200,50);
		rueda=new Ellipse(25,200,50,50);
		rueda1=new Ellipse(175,200,50,50);

		cuadrado.setColor(Color.RED);
		cuadrado.fill();
		cuadrado1.setColor(Color.GRAY);
		cuadrado1.fill();
		rueda.setColor(Color.BLACK);
		rueda.fill();
		rueda1.setColor(Color.BLACK);
		rueda1.fill();
	}
}