import javax.swing.JOptionPane;
public class AreaAPP {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		
		String radio=JOptionPane.showInputDialog("Introduce el radio del c�rculo ");
		System.out.println("El radio es "+radio);
		double radionum=Double.parseDouble(radio);
		System.out.println("El �rea del c�rculo es = " +PI*(Math.pow(radionum, 2)));
		
	}

}
