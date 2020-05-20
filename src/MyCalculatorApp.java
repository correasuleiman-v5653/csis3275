import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author victo
 *
 */
public class MyCalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Hi, I will subtract 2 numbers for you! Enter the first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Now enter the second number:"));
		
		JOptionPane.showMessageDialog(null, a + " - " + b + " is equal to " + (a-b));

		//Test successful!
	}

}
