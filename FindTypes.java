package week3.Homework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindTypes {

	public static void main(String[] args) {
		
		
		/* This is to identify th number of spaces , letters, special symbols , numbers in the given sentence */
		
		/* Declaring the input */
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		
		/* Delcaring the variable to make the count */
		int  letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		/* converting the String to an array */
		char[] testarray = test.toCharArray();
		
		/* to find the lenght of array */
		int testlength = testarray.length;
		
		
		 for (int i=0; i<testlength; i++)
		 {
			 if(Character.isLetter(testarray[i]))
			 {
				 letter++;
			 }
			 
			 else if(Character.isDigit(testarray[i]))
			 {
				 num++;
			 }
			 else if(Character.isSpaceChar(testarray[i]))
			 {
				 space++;
			 }
			 else
			 {
				 specialChar++;
			 }
		 }
		 
		 System.out.println("The letters within the string is "+letter);
		 System.out.println("The numbers within the string is "+num);
		 System.out.println("The space within the string is "+space);
		 System.out.println("The Character within the string is "+specialChar);
		
		
		
		/* List<Character>alphabets= new ArrayList<Character>();
		
		
		List<Integer>numbers= new ArrayList<Integer>();
		
		for(char tempvalue:alphabet)
		{
			alphabets.add(tempvalue);
		}
		
		for(int tempnum:number)
		{
			numbers.add(tempnum);
		}
		
		
		 for (int i=0; i<testlength; i++)
		 {
		   if(testarray[i]
		   {
			   letter ++;
		   }
		   else if(test.contains(tempnum))
		   {
			   num++;
		   }
		   else if(test.contains(space))
		   {
			   space++;
		   }
		   else if
		   {
			   specialChar++;
		   }
		   
		 }*/
	}

}
