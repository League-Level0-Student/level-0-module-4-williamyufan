//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		String nickle=JOptionPane.showInputDialog(null, "how many nickels do you  have?");

		int numNickles=Integer.parseInt(nickle);

		String dime=JOptionPane.showInputDialog(null, "how many dimes do you have?");
		
		int numDimes=Integer.parseInt(dime);
		
		
		String quarter=JOptionPane.showInputDialog(null, "how many quarter do you have?");
		
		int numQuarter=Integer.parseInt(quarter);
		
double money=(0.25*numQuarter)+(0.1*numDimes)+(0.05*numNickles);

System.out.println(money);
	}
}

