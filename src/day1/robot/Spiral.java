package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot parker= new Robot();
		// 5. Set your robot's pen to the down position
		parker.penDown();
		// 3. Set the robot to go at max speed (10)
parker.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for (int i = 0; i < 75; i++) {
	

			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	parker.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	parker.turn(360/3);
	
			// 9. Set the pen width to i
}
	}
}
