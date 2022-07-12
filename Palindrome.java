package assignmentWeek1Day2;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String Str = "MADAM";
		String ReverseStr = "";	
		char[] chars= Str.toCharArray();
		
		for (int i = chars.length-1; i >= 0; i--) 
		{
			ReverseStr = ReverseStr + Str.charAt(i);
		}

		if (Str.equals(ReverseStr))
		{
			System.out.println(Str + " is Palindrome");
		}else
		{
			System.out.println(Str + " Not Palindrome");
		}
	}

}




