package week3.Homework;

public class CharAccurance {

	public static void main(String[] args) {
		
		
		/* **************Check number of occurrences of a char (eg 'e') in a String************ */
		
		/* Declaring the input string variable */
		String str = "welcome to chennai";
		
		/* Declaring an int variable to count the number of Occurances*/
		int count = 0;
		
		/* Converting the string into character of Array */
		char[] strArray = str.toCharArray();
		
		/* Finding the length of array */
		int arraylength = strArray.length;
		
		for (int i=0; i<=(arraylength-1);i++)
		{
			if( strArray[i]=='e')
			{
				count++;
			}
		}
		
		System.out.println("The character 'e' in the given sentence has occured "+" "+count+" "+"times in this sentence");
		}
		
		
	}


