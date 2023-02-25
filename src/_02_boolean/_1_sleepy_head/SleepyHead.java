package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// so far you worked with data types String, int, and
		// double.  here you'll work with type boolean
		
		
		// boolean variables can only hold one of two values - true or false.
		// You have already been using booleans in the form of comparisons
		// i.e. >, <, ==, >=, <=, .equals() which all produce a true or false
		// value.
		
		boolean isWeekend = true;//only if this is changed then the answer 
		//will change too.  yes.  its showing that in an if(...)
		// you can test the value of a boolean variable inside the
		// parentheses.  undersstand?i think i do.
		// so inside the 'if' parentheses, there is a test of something
		// that is either determined to be true or false.
		// In the previous program, a test was if (numScore > 80.0).
		// In this program, the test is if (isWeekend).ok
		// ready for the next program?yes
		
        // 1.) Run the program and look at the if-else statement below.
		
        // 2.) Change the value of isWeekend so that the pop-up in the
        //     if statement happens instead.  no, thats changing the name!
		//i change the value??  on line 19
        // Notice that when using a boolean variable in an if statement 
		// there is no need for comparisons because it is already a true 
		// or false value.
		
		if(isWeekend) {
			JOptionPane.showMessageDialog(null, "You can sleep in! There's no school today.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}

	}
}
