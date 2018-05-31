import javax.swing.JOptionPane;

public class testscore {
	
public static void main(String[] args) {
	
	String score=JOptionPane.showInputDialog(null, "What is your test score?");
	
	double numscore=Double.parseDouble(score);
	
	if (numscore >99.9){
		JOptionPane.showMessageDialog(null, "Wow, you are good");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "You Are toooooooooo bad, you should quit this...");
		
	}
	
}
}
