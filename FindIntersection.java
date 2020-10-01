package week3.Homework;

public class FindIntersection {

	public static void main(String[] args) {
		
		/*  Declare An array for {3,2,11,4,6,7} */
		
		int[] first = {3,2,11,4,6,7};
		
		/* Declare another array for {1,2,8,4,9,7} */
		int[] last = {1,2,8,4,9,7};
		
		/* Declaring a string and assigning to null value */
		String str = "";
		
		
		/* Loop to find the intersection of  sets */
		for (int i=0; i<first.length;i++)
		{
			for(int j=0;j<last.length;j++)
			{
				if(first[i]==last[j])
				{
					/* This + will convert the value into a string and hence the values get concatenated */
					str = str+first[i]+""+",";
					
				}
			}
		}
		
		/* Calculating the String length ie, intersection values */
		int OutputLength = str.length();
		
		/* Trimming the last digit ',' from the resultant outcome */
		String str1 = str.substring(0, OutputLength-1);
		
		/* Printing out the resultant value */
		System.out.println("The intersected values of first set with the second set is "+str1);
		

	}

}
