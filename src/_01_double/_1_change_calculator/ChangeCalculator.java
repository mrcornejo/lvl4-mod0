package _01_double._1_change_calculator;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */
// i'm helping Jay for a bit, ok?
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int numNickels = Integer.parseInt(nickels);
		// it involves 2 steps.  step one is JOptionPane,
		// step 2 is converting a string into an int ...ok
		// questions?
		
		// JOptionPane returns a value that you need to
		// save into a String variable.
		// then convert it into an int.
		// e.g. int numNickels = Integer.parseInt(the string goes here)
		// ok?
		
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		//Integer.parseInt(null);
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int numDimes = Integer.parseInt(dimes);	// the name dimes and Dimes are not the same!
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have");
		int numQuarters = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
//to add all the money do i use in the code && or ++
		// this is arithmetic so you can us +,-,*,/ as needed
		//numNickels + numDimes + numQuarters
		// this is arithmetic ... but it's just adding up
		// the total number of coins.  how do you calculate
		// the value of the money?  like a nickel is 0.05,
		// a dime is 0.10, etc  questions?
		
		// questions?yes how do i start to add..like what method do i use
		// it's not a method.  do arithmetic like in math class.
		// 
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

//		String money = JOptionPane.showInputDialog("How much money do you have in total?");
//		int nummoney = Integer.parseInt(money);
		double total = numNickels*0.05 + numDimes*0.10 + numQuarters*0.25;
		System.out.println("Total amount is $" +  total);
		// String.format(%.2f, total)
		
		// it's kinda working.  want to say this program is done?
		// does it calculate correctly?  looks ok.
		
		// hmm i'm having trouble :(
		// can i fix a few things?yes  ok.run it
		// so $1.30 ... can i fix it a bit so the output
		// looks like money?yes
	}
}

