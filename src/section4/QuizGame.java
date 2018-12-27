package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String A1 = JOptionPane.showInputDialog("How old was the worlds oldest cat?");
		// 3.  Use an if statement to check if their answer is correct
		if (A1.equals("39")) {
			JOptionPane.showMessageDialog(null, "You are correct");	
			score ++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
		
		String A2 = JOptionPane.showInputDialog("How many amendments are there to the U.S. Constitution?");
		// 3.  Use an if statement to check if their answer is correct
		if (A2.equals("27")) {
			JOptionPane.showMessageDialog(null, "You are correct");	
	score ++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
		
		String A3 = JOptionPane.showInputDialog("Can a Cheif Justice become President?");
		if (A3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You are correct");	
		score ++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
		
		String A4 = JOptionPane.showInputDialog("Who is the most famous Youtuber (in the U.S.A) of 2018?");
		// 3.  Use an if statement to check if their answer is correct
		if (A4.equalsIgnoreCase("PewDiePie")) {
			JOptionPane.showMessageDialog(null, "You are correct");	
		score ++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		JOptionPane.showMessageDialog(null, "You got " + score + " out of 4 questions correct");
		for (int i = 0; i < 2; i++) { {
			JOptionPane.showMessageDialog(null, "Congrats!");
		}
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
}
