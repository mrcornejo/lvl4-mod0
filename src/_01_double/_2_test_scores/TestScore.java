package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		// ask user to enter a score (that includes a decimal pt)
		String scores = JOptionPane.showInputDialog("What is your test score");

		// convert their answer from a String to a double
		double numScore = Double.parseDouble(scores);
		
		// decide what comment you want to make depending
		// on the score they entered, which is now
		// stored in the variable numScore
		
		// you could use System.out.print - it's easier
		if (numScore > 80.0)System.out.print("Wow!You did great!");
//		int numScore = Integer.parseInt(100);
//		else double numScorea = Double.parseDouble(90.);
		
		else if (numScore <80.0)System.out.print("Try harder next time.");
		else if (numScore == 80.0)System.out.print("Wow!You did great! Better be more prepared for next time.");
		// good !  fyi you could also do >= 80.0 if you wanted
		// this program is done!
		
		//.. test some more numbers like less than 80
		//and 80.0  .. it didnt print anything for 80.0 .bc
		 //its always higher or lower oooo ok
		//double total = A==9
		
		//on change calculator, to have the total number be use
		//double total = numNickels*0.05 +....but in this 
		//im confused bc in the previous class i used double numScore..
		//instaed of double total
		//and for the score i dont know hot to make Score A, it can be 
		//90.somthing of 100
		
		// you don't need that...
		
		//i'm not sure i understand.  that said, let me explain
		// the similarities and differences between these 2
		// programs....
		
		// both programs ask the user for input using JOptionPane,
		// which always returns the user's answer as a String
		// (which is like a series of characters that were
		// typed on the keyboard).  In these 2 programs we
		// want to convert the String into a number.  There
		// are 2 different types of numbers in Java - 'int'
		// (a whole #) and 'double' (a number with a decimal
		// point).  For example, Java stores the number 2
		// in a different way than it stores the number 2.0!
		
		// in *this* program, you read in a number as a String,
		// convert it to a double, and then have somee
		// if-else code to decide what to say about the
		// score... like 80.0 thru 100.0, "good job" and
		// less than that "try harder".
		
		// questions?no
		
// questions?yes
			//a,b,c,d,f
			// question about line 10? what is Double.parseDouble
			// it converts a String to a number that has a decimal pt
			
					// class is almost over
					// can i show you the idea and
					// then help you save work?yes
		//i dont know...how then will put the answer
				
			
	// ok let me explain some things.  let's say you
	// enter 75.5, then there are different ways the computer
	// can store that: as a String "75.5" which has 4 characters,
	// 7 ... 5 .. period .. 5.  OR as a double 75.5, which
	// is a single number.  confusing, but do you understand what
	// i mean so far? no but what is this used for like in this program

	// JOptionPane always saves the user's answer as a String.
				// but in this program we want to convert
				// it to a number.
				// do you want me to show you?
				// in the last program we had to
				// convert String to int.  we did this:
			//	int numQuarters = Integer.parseInt(quarters);
				
				// can you use that idea here BUT convert
				// from String to double?
				
		
	}

}

/*     Write code to ask the user for their test score.
    Your program MUST allow the user to enter a test score that has a DECIMAL, e.g. 75.5
    Give them a different message according to their score.
    Example, for a good score: "Wow! You must have studied really hard for that test!"

    HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double. 
*/