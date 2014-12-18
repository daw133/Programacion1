package ejercicios.Graficos;

import graphics.*;

public class E04Pelota {
	
	public static void main(String[] args) throws InterruptedException {

		Rectangle rectangulo = new Rectangle(10, 10, 400, 300);
		rectangulo.draw();

		Ellipse pelota = new Ellipse(200, 200, 60, 60);
		pelota.setColor(Color.RED);
		pelota.fill();

		int velocidadHor = (int) (Math.random() * 5 + 1);
		int PosHNeg = (int) (Math.random() * 2 + 1);
		int velocidadVer = (int) (Math.random() * 5 + 1);
		int PosVNeg = (int) (Math.random() * 2 + 1);
		double tiempoEspera = (int) (Math.random() * 20);

		switch (PosHNeg) {
				case 1:
					velocidadHor = velocidadHor;
					break;
				case 2:
					velocidadHor = velocidadHor * -1;
				}

		switch (PosVNeg) {
				case 1:
					velocidadVer = velocidadVer;
					break;
				case 2:
					velocidadVer = velocidadVer * -1;
				}

		while (true) {
			
				if (pelota.getX() < 10 || pelota.getX() > (400 - 60)) {
					velocidadHor = velocidadHor * -1;
				}
	
				if (pelota.getY() < 10 || pelota.getY() > (300 - 60)) {
					velocidadVer = velocidadVer * -1;
				}
	
				pelota.translate(velocidadHor, velocidadVer);
				Thread.sleep(Math.round(tiempoEspera));
			}

	}
}