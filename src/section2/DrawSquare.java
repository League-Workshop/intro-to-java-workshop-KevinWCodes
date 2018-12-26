package section2;



import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
	public static void main(String[] args) {

Robot drone = new Robot();
drone.penDown();
drone.setSpeed(100);
drone.move(150);
drone.turn(90);
drone.move(150);
drone.turn(90);
drone.move(150);
drone.turn(90);
drone.move(150);
drone.turn(90);
	}
}