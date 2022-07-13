package assignmentWeek1Day2;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code

		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for  {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		//Declarations
		int [] ArrayA1 = {3,2,11,4,6,7};
		int [] ArrayA2 =  {1,2,8,4,9,7};
		int Lenght1 = ArrayA1.length;
		int Lenght2 = ArrayA2.length;

		//To Print Array A1
		System.out.print ("Array A1:" );
		for(int x=0;x<Lenght1;x++) 	{
			System.out.print (" " + ArrayA1[x]);
		}
		System.out.println("");

		//To Print Array A2
		System.out.print ("Array A2:" );
		for(int y=0;y<Lenght2;y++) {
			System.out.print (" " + ArrayA2[y]);
		}
		System.out.println("");

		//To Find and print Intersection Array
		System.out.print("Intersection Array:");

		for(int i=0;i<Lenght1;i++)
		{
			for(int j=0;j<Lenght2;j++) {
				if (ArrayA1[i] == ArrayA2[j])
				{
					System.out.print (" " + ArrayA1[i]);
				}
			}

		}
	}

}

