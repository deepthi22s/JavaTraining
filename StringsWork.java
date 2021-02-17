	// Strings
	// 	- java.lang.String
	// 		- Immutability
	// 		- String Constant Pool

import java.util.Scanner;
class StringsWork{
	public static void main(String[] args) {
		// Create a reference of the java.lang.String

		// String str = new String("We are getting started with Strings in java...");

		//str = "We are getting started with Strings in java...";

		String s = new Scanner(System.in).nextLine();

		// String str = "HELLO";

		// s += ", Howdy?";

		s = s.concat(" What's up?");

		s.toLowerCase();

		s = s.toUpperCase();

		System.out.println("Length of string is : " + s.length());

		System.out.println("Character at index 5 in the string is : " + s.charAt(5));

		System.out.println(s.substring(3));
		s=s.substring(4, 9);
		System.out.println(s);
		System.out.println(s.codePointAt(4));

		// System.out.println(s.trim());

		// String []values = s.split(" ");

		// System.out.println("Tokens : ");

		// for(String value : values){
		// 	System.out.println(value);
		// }

		// System.out.println("Value of s is : " + s); // Hey there

		// String val = "Hey there!";

		// String v = "hello";

		// System.out.println(v);
	}
}

// class Other{
// 	void func(){
// 		String myVal = "hello";

// 		myVal = "Rishabh..." + myVal;

// 		// SOme more work here....
// 	}
// }


// // SCP----  Hey there!
					// 	 What's up?
					// 	 Hey there! What's up
					// hey there! what's up
					// s----->HEY THERE! WHAT'S UP
					//  THERE! WHAT'S UP
					// THERE
					//HEY
					//THERE!
					//WHAT's
					//UP