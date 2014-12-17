package ejercicios.If;

import javax.swing.JOptionPane;

public class E10PH {

	public static void main(String[] args) {

		String phcadena = JOptionPane
				.showInputDialog("Averiguando si un compuesto es �cido y muy �cido.\n"
									+ "Introduce el valor del PH del compuesto:");
		double ph = Double.parseDouble(phcadena);

		if (ph > 3.0 && ph <= 7.0) {
			JOptionPane.showMessageDialog(null,
					"El compuesto es �cido (PH menor de 7.0)");
		}

		if (ph <= 3.0) {
			JOptionPane.showMessageDialog(null,
					"El compuesto es peligrosamente �cido (PH menor de 3.0)");
		}
	}
}