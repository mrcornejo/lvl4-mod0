package _02_boolean._2_star_student;

import javax.swing.JOptionPane;

public class StarStudent {
	
	public static void main(String[] args) {
		
		// booleans may be passed as parameters in method calls just like an
		// an int or any other kind of value. 
		
		// 1. Initialize passedExam to a value.

		boolean passedExam = false;
		
		// 2. Call the didYouPass method with the variable you just initialized
		//    as the parameter so that it shows a pop-up.
		// do you understand what a method is?  and how to call it?
		//yes like system.prit.out (), no?  yes but let me explain a bit more...
		
		// here you can CALL the method didYouPass and it will execute (do) the
		// code inside the method (ie inside the box).  can you call it here?idk
		// questions?  want me to show you?yes
		didYouPass(passedExam);	// 'passedExam' is a parameter that is sent over
			// to this method.  this particular method uses its value to decide
		// which message to print out.  want to run the program and test it?
		// understand?yes
		
		// The "not" operator (!) can be placed before a boolean value to 
		// temporarily "flip" the value between true and false.
		
		// 3. Use a ! on the boolean variable in either your method call or in 
		//    the didYouPass method itself to get the other pop-up to show 
		//    without changing the original value you gave to passedExam.
		
	}
	
	// here is the DEFINITION of a method called didYouPass.  a method is
	// like a box with code inside.
	public static void didYouPass(boolean passedExam) {
		
		// i'm going to purposely mess up the answers by putting a ! in
		// so now, when you DONT pass the exam it says "Congrats"  hah hah
		// questions?no.
		
		// we could now look at the next program.  soon we should save work
		// i have your 'token' for github
		
		if(!passedExam) {
			JOptionPane.showMessageDialog(null, "Congratulations!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}
		
	}

}
