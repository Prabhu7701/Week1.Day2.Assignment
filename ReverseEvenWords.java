package assignmentWeek1Day2;

public class ReverseEvenWords {

	private static final String[] String = null;

	public static void main(String[] args) {
		/* Pseudo Code:
		 * Declare the input as Follow
	      String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) split the words and have it in an array
		e) print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end). 
		 */

		String text = "I am a software tester";
		String[] str =text.split(" ");
		int length1=str.length;
		String EvenReverseword ="";
		System.out.println("Orignal sentense: "+text);
		System.out.print("After change: ");
		for(int i=0;i<length1;i++) 
		{
			if (i%2==1) 
			{
				char[] charArray=str[i].toCharArray();
				int length2 = charArray.length;
				for (int j = length2-1; j >= 0; j--) 
				{
					EvenReverseword = EvenReverseword + charArray[j];

				}
				System.out.print (EvenReverseword+ " ");
			}
			else {
				System.out.print(str[i]+" ");
			}
		}
	}				






	//		System.out.println("Word count in the sentence  is :" + length);
	//		System.out.println("Original sentence  is : "+ text);
	//		System.out.println("Checking word for duplicate is 'Java'");
	//		System.out.println("Without duplicate word");



}
