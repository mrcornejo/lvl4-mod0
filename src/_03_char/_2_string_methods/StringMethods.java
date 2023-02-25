package _03_char._2_string_methods;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3
		// characters
		String str = "ABCDEF";
		System.out.println(str.charAt(2));

		// 3. Print the length of your String to the console.
		// HINT: .length()
		// int count = str.length();
		System.out.println("Length of the string: " + str.length());
		// System.out.println("There are" +count+ "characters in the string!");
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"
		// if b is 1, a is 0 and c is 2

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'F') {
				System.out.println("F is at index " + i);
			}
		}

	}
}
