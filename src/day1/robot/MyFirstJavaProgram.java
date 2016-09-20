package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot parker=new Robot();
	parker.penDown();
	parker.move(200);
	parker.turn(90);
	for (int i = 0; i < 4; i++) {
		parker.move(90); 
	}
	 
	
	
	
	
	
	}
	
	
	
}