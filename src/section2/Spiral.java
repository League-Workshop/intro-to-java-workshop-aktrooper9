package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot ig3p=new Robot();
		// 5. Set your robot's pen down 
		ig3p.penDown();
		// 3. Set the robot to go at max speed (100)
		ig3p.setSpeed(500000000);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int i = 0; i <900000; i++) {
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			ig3p.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		ig3p.turn(360/7);
			// 8. Set the pen width to i
		
			ig3p.setRandomPenColor();
			ig3p.setPenWidth(i);
		}
	}
}
