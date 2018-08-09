package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int hp = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dhp = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int pd = 1;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dd = 1;

		// 6. Delete the slashes at the beginning of the next line.
		while (hp > 0 && dhp > 0) { // this line of code keeps the battle going until someone's health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String action = JOptionPane.showInputDialog(null, "Do you want to yell or kick.");
			// 9. If they typed in "yell":

		
			
			// -- Find a random number between 0 and 10 and store it in dragonDamage
		if (action.equalsIgnoreCase("yell")) {
			dd = new Random().nextInt(11);
			// -- Subtract that number from the dragon's health variable
		 dhp = dhp - dd;
			// 10. If they typed in "kick":
		}
			// -- Find a random number between 0 and 25 and store it in dragonDamage
		else { 
		dd = new Random().nextInt(26);
		 dhp = dhp - dd;
		}
			// -- Subtract that number from the dragon's health variable

			// 11. Find a random number between 0 and 35 and store it in playerDamage
			 pd = new Random().nextInt(36);

			// 12. Subtract this number from the player's health
			 hp = hp - pd;

			// 13. If the user's health is less than or equal to 0
			if (hp <= 0) { // -- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You Died");
			}
			// 14. Else if the dragon's health is less than or equal to 0
			else if (dhp <= 0) {
				JOptionPane.showMessageDialog(null, "You Won.");
			}
			// -- Tell the user that the dragon is dead and they took a ton of gold!

			// 15. Else
			else {
				JOptionPane.showMessageDialog(null, "Your health: " + hp + " The dragons health: " + dhp + ".");

				// -- Pop up a message that tells the their current health and the dragon's
				// currently health (Bonus: Also display the amount of health that was lost for
				// each player this round)

			}

		}

	}

}