package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog(null,"Can you code?");

		// 2. If they say "yes", tell them they will rule the world.
if(answer.equals("yes")) {
	System.out.print("YOUSA JEDI!!!!!!!!!!");
}
		// 3. Otherwise, wish them good luck washing dishes.
if(answer.equals("no")) {
	System.out.print("YOUSA SITH LORD");
}
	}
}

