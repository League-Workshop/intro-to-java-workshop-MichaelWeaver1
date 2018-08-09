package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String Q1 = JOptionPane.showInputDialog(null, "Are you in the middle classroom of three? Yes or No.");
		// 3. Use an if statement to check if their answer is correct
		if (Q1.equalsIgnoreCase("Yes")) {
			score++;
		}
		// 4. if the user's answer is correct
		String Q2 = JOptionPane.showInputDialog(null, "Some types of eels can use camoflauge. Yes or No.");
		if (Q2.equalsIgnoreCase("No")) {
			score++;
		}
		String Q3 = JOptionPane.showInputDialog(null,
				"Is there a type of sea creature known as a cuddle fish? Yes or No.");
		if (Q3.equalsIgnoreCase("No")) {
			score++;

		}

		JOptionPane.showMessageDialog(null, "Your score was " + score);

	}
}
