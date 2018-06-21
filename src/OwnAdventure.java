import javax.swing.JOptionPane;

public class OwnAdventure {
	
	public static void main(String[] args) {
		
		String Plot=JOptionPane.showInputDialog(null, "You came out of the forest in a dark stormy night. You have three ways to go: go back to the forest.  Enter a house.  Go through the field.");
		
		if (Plot.equals("go back to the forest" )) {
			
			JOptionPane.showMessageDialog(null, "You are badly injured because a tree hit you leg.");
			String plott=JOptionPane.showInputDialog(null, "You have another two choices to make: \"break your arm free and lose your arm\" or \"call for help\"");
			if (plott.equals("break your arm free and lose your arm")) {
				JOptionPane.showMessageDialog(null, "You Survived!");
				
			}
			else if(plott.equals( "call for help")) {
				JOptionPane.showMessageDialog(null, "You Died because you lose too much blood and no one came.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You died anyway.");
			}
			
		}
		else if (Plot.equals("Enter a house")) {
			JOptionPane.showMessageDialog(null, "You Survived!");
		}
		else if (Plot.equals("Go through the field")) {
			JOptionPane.showMessageDialog(null, "You Died because you are too light, the wind blown you away.");
		}
			else {
				JOptionPane.showMessageDialog(null, "You died anyway.");
			
			
				
		}
	}

}
