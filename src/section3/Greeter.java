package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Ahoy Hoy");
	
	String name = JOptionPane.showInputDialog("Please type your name");
	if (name.equals("Kevin")) {
		JOptionPane.showMessageDialog(null, "What a cool dude");
		} else {
			JOptionPane.showMessageDialog(null, "O.K. then.");
			
		}
			
			JOptionPane.showMessageDialog(null, "what's up " + name);
}
}
