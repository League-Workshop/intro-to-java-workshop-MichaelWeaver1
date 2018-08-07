package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		// Yeah Boi

		System.out.println("Hello World");

		Robot marvin = new Robot();
		marvin.miniaturize();
		marvin.sparkle();
		marvin.setPenColor(3, 156, 5);
		marvin.setSpeed(1000);
		marvin.penDown();
		for (int i = 0; i < 4; i++) {
			marvin.move(100);
			marvin.turn(90);
		}
		marvin.penUp();
		marvin.move(1000);

	}

}
