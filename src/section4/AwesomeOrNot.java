package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rand = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(rand);
	// 4. Get the user to enter something that they think is awesome
String thing = JOptionPane.showInputDialog("What is something awesome.");
	// 5. If the random number is 0
if (rand == 0) {
	JOptionPane.showInternalMessageDialog(null, "That is awesome.");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
else if (rand == 1) {
	JOptionPane.showInternalMessageDialog(null, "Hmmmm, thats okay.");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
else if (rand == 2) {
	JOptionPane.showInternalMessageDialog(null, "That's boring.");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
else if (rand == 3) {
	JOptionPane.showInternalMessageDialog(null, "That is incre-di-bles.");
}
	// -- write your own answer
}
}


