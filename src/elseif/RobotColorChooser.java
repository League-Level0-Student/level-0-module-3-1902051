//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bob = new Robot();
		// 3. As
String bokv = JOptionPane.showInputDialog(null, "WhAt CoLoR d0 Y0U wHaNt");
		
		
		
		// . Use an if/else statement to set the pen color that the user requested
		
if(bokv.equals("red")) {

}
	
		
		// 6. If the user doesn’t enter anything, choose a random color 

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
 bob.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)

		bob.penDown();
		bob.setSpeed(20000);

		for (int i = 1; i < 100; i++) {

			bob.turn(90);
			bob.move(100);

			bob.turn(30);
			bob.move(30);

			bob.turn(140);
			bob.move(140);
			
			bob.turn(280);
			bob.move(270);
			
			bob.turn(370);
			bob.move(360);
	
		}
	}

	private static void showInputDialog(Object object, String string) {
		// TODO Auto-generated method stub

	}

}
