import javax.swing.JOptionPane;

public class EntradaSalidaJOptionPane {

	public static void main(String[] args) {

		// Declaro variables
		
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		//Guardar un string, un entero, un caracter y un decimal
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero:"));
		letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un número decimal: "));
		
		//Mostrar datos guardados
		
		JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null,"La entero es: "+entero);
		JOptionPane.showMessageDialog(null,"La letra es: "+letra);
		JOptionPane.showMessageDialog(null,"El decimal es: "+decimal); // escribir el número decimal con coma. 

		
	}

}
