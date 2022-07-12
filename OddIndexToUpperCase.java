package assignmentWeek1Day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c) find the odd index within the loop (use mod operator)
		 * d) within the loop, change the character to uppercase, if the index is odd else don't change
		 */

		String test = "changeme";
		char[] chars= test.toLowerCase().toCharArray(); // To change the string to lower case
		System.out.println("The given String is "+ test);
		System.out.print("The OddIndex String is ");
		for (int i = 0; i <= chars.length-1; i++) 
		{
			if (i%2==0)
			{

				System.out.print(Character.toUpperCase(chars[i]));
			}
			else {
				System.out.print(chars[i]);
			}
		}
	}
}
