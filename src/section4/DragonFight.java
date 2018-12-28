package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		String choice = JOptionPane.showInputDialog("Do you enter the maze?");

		String room1 = JOptionPane.showInputDialog("In the dungeon there is a pot, a lever, and a door. You can throw the pot at the lever, smash the pot, pull the lever, or open the door.");
				if (room1.equalsIgnoreCase("smash the pot")) {
					JOptionPane.showMessageDialog(null, "you find a coin");
					String loldeath = JOptionPane.showInputDialog("Do you flip the lever or open the door?");
					JOptionPane.showMessageDialog(null, "When you tried to " + loldeath + " you activated a trap. You died.");
					System.exit(0);
				}
				if (room1.equalsIgnoreCase("throw the pot at the lever")) {
					JOptionPane.showMessageDialog(null, "When the lever moves, the door opens, but a trap is activated. The trap does not hurt you. You move to the next room.");
				} else {
					JOptionPane.showMessageDialog(null, "When you try to " + room1 + ", the door opens, but a trap activates. The trap hurts you. You died.");
				System.exit(0);
				}
			
				JOptionPane.showMessageDialog(null, "You can find hidden things to help you escape. Type 'hint' for a clue or just type 'examine'.");
		String room2 = JOptionPane.showInputDialog("There is a poster, ");
		
		
		Random crazy = new Random();
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 90;
		// 4. Create a variable to hold the damage the player's attack does each round

		// 5. Create a variable to hold the damage the dragon's attack does each round

		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attack = JOptionPane.showInputDialog("Attack the dragon with a yell or a kick");
		// 9. If they typed in "yell":
		if (attack.equalsIgnoreCase("kick")){
			dragonHealth = dragonHealth - crazy.nextInt(27);
		}
		if (attack.equalsIgnoreCase("yell")){
			dragonHealth = dragonHealth - crazy.nextInt(12);
		} 
		if (attack.equalsIgnoreCase("gun")){
			dragonHealth = dragonHealth - crazy.nextInt(100);
		}
		if (attack.equalsIgnoreCase("hint")){
			dragonHealth = dragonHealth - crazy.nextInt(10);
			JOptionPane.showMessageDialog(null, "You came here armed. Use your _____.");
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			if (dragonHealth < 1) {
				JOptionPane.showMessageDialog(null,"You got the pile of gold and the dragon was slain, Game Over.");
			} else {
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			int dragonDamage = crazy.nextInt(36);
			playerHealth = playerHealth - dragonDamage;
			}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		if (playerHealth < 0) {
			JOptionPane.showMessageDialog(null,"Your skull was crushed and you were slain, Game Over.");
		}
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		JOptionPane.showMessageDialog(null,"Your current health is " + playerHealth + ". The Dragon's current health is " + dragonHealth + ". Good luck!");
		}
		
	
	

	}
}

