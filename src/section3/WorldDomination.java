package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
		
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
speak("Do you know how to write a the code??");
String win = JOptionPane.showInputDialog("Yes or No?");
		// 2. If they say "yes", tell them they will rule the world.
if (win.equalsIgnoreCase("yes")) {
		// 3. Otherwise, wish them good luck washing dishes.
	speak("Ha, I don't believe you, but if you Did code, you'd rule the world!");
} else {
speak("I hope for if that you like enjoy the a washing dishes!");

}
	}
	static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			}
			catch (Exception e) {
				e.printStackTrace();
	}

	}
}
