package week3.Homework;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		/*  Declare String Input as Follow */
		
		/* Input value */
		String test = "changeme";
		
		/* Convert the String to character array */
		char[] charArray = test.toCharArray();
		
		/* find the length of array */
		
		int arraySize = charArray.length;
		
		for (int i=0; i<arraySize;i++)
		{
			if(i%2!=0)
			{
			    char value = Character.toUpperCase(charArray[i]);
				System.out.print(value);
			}
			else
			{
				System.out.print(charArray[i]);
			}
				
		}

	}

}
