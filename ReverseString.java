package week3.Homework;

public class ReverseString {

	public static void main(String[] args) {
		
		/* This program is to reverse the String */
		// Here is the input
				String test = "feeling good";
				
		/* Pseudo code 1 */
				/* convert the string to an array */
				char[] testArray = test.toCharArray();
				
				/* find the length of the array */
				int arrayLength = testArray.length;
				
				/* Code to reverse the string */
				for (int i = (arrayLength-1); i>=0;i--)
				{
					System.out.print(testArray[i]);
				}
				
						
				
		/* Pseudo code 2 */	
			/* Length of the String */
				
				int StrLength = test.length();
				
				for(int i=StrLength-1;i>=0;i-- )
				{
					System.out.print(test.charAt(i));
				}
		

	}

}
