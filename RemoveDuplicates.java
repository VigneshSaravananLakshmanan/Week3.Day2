package week3.Homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	/* Use the declared String text as input */
	
	public static void main(String[] args)
	{
		String name = "We learn java basics as part of java sessions in java week1";
		
	
	   /*  split the Sentence into words */
		String[] words = name.split(" ");
		
		/* Calculating the array length */
		int arrayLength = words.length;
		
		/* copying the string array values to a Collection set to remove duplicates*/
		Set<String>removeDuplicates = new LinkedHashSet<String>();
		
		for(String tempvalue:words)
		{
			removeDuplicates.add(tempvalue);
		}
		
		
		/* To convert the Set into an array of Strings, a string array named TrimmedDuplicates is created and the value from the 
		 * Collection-Set is copied into the String array using for each loop 
		 */
		/* Declare a String array */
		String[]trimmedDuplicates = new String[arrayLength];
		
		/* Initializing the input variable */
		int i=0;
		for(String value:removeDuplicates)
		{
			trimmedDuplicates[i]=value;
			i++;
		}
		
		String str= "";
		
		for(int j=0; j<arrayLength-1; j++)
		{
			str = str+trimmedDuplicates[j]+" ";
		}
		
		int strLength = str.length();
		
		String finalValue = str.substring(0, strLength);
		
		System.out.println(finalValue);
		
		
		
	
		
		
	
		
		
	}
	
	
	

}
