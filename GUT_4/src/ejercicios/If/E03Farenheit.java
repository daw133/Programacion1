package ejercicios.If;

import javax.swing.JOptionPane;

public class E03Farenheit {

	public static void main(String[] args) {

		String gradosfa;

		gradosfa = JOptionPane
				.showInputDialog("Vamos a convertir grados Fahrenheit a grados centígrados\n"
								+ "Introduce la temperatura en ºF:");

		int fa = Integer.parseInt(gradosfa);
		//Integer.toString(fa);

		int cent = (int) ((fa-32)/1.8);

		JOptionPane.showMessageDialog(null,
				"La temperatura que has introducido es de " + fa
						+ " ºF. La temperatura en ºC es de " + cent);
		if (cent <= 0) { 
			JOptionPane.showMessageDialog(null, "¡Congelación!");
		}

	}

}
