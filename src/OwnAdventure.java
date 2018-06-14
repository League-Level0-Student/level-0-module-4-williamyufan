import javax.swing.JOptionPane;

public class OwnAdventure {
	
	public static void main(String[] args) {
		
		String Plot=JOptionPane.showInputDialog(null, "You came out of the forest in a dark stormy night. You have three ways to go: go back to the forest.  Enter a house.  Go through the field.");
		
		if (Plot.equals("go back to the forest" )) {
			
			JOptionPane.showMessageDialog(null, "You Died because a tree hit on the head.");
			
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
