package section2;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
		
	// 2. Create a new Robot
Robot cool = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
cool.setSpeed(1000);
		// 5. Set the pen width to 5
cool.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	cool.setRandomPenColor();
			// 1. Call the drawSquare() method
		cool.penDown();
	cool.setSpeed(300);
		cool.move(150);
		cool.setRandomPenColor();
		cool.turn(90);
		cool.move(150);
		cool.setRandomPenColor();
		cool.turn(90);
		cool.move(150);
		cool.setRandomPenColor();
		cool.turn(90);
		cool.move(150);
		cool.setRandomPenColor();
		cool.turn(90);
	
			// 8. Turn the robot 90 degrees to the right
		cool.turn(270);
}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



