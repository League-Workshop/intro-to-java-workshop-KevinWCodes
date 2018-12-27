package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Wow, you are stupid.");
		// 2. Catch the user's answer in a String
speak("spell 'Mandlebrot'");
String ans = JOptionPane.showInputDialog("Type here");
		// 3. If the user spelled the word correctly, speak "correct"
if (ans.equalsIgnoreCase("Mandlebrot")) {
	speak("Correct lol. arbhgbuh.");
	} else {
		speak("Yes, your are dumb. Ja Ja Ha Ja JaHA Ha ja ha ha ja ha jaja ha ja ah ha ha. ha. ha. ha. hahahahahahajaha.");
		
	}

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
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


