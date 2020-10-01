package week3.Homework;

public class Palindrome {

	public static void main(String[] args) {
		/* Declare A String value as"madam" */
		 String name = "madam";
		 
		 /* converting the string to an array*/
		 char[] initialArray = name.toCharArray();
		 
		 /* Calculating the length of the array */
		 int arrayLength = initialArray.length;
		 
		 /* Creating a reference array to verify the Palindrome */
		 char[] finalArray = new char[arrayLength];
		 
		 /* Initializing the variable to 0 */
		 int j=0;
		 
		 /* reversing the first array and creating a second array */
		 for (int i=arrayLength-1;i>=0;i--)
		 {
			 finalArray[j]=initialArray[i];
			 j++;
		 }
		 
		 /* Verify the Palindrome */
		 /* ---------------------- */
		 /* converting the array to String */
		String referenceValue=String.valueOf(finalArray);
		
		/* comparing the 2 string values */
		if(name.equalsIgnoreCase(referenceValue))
		{
			System.out.println("The given"+" "+name+" "+"is a palindrom");
		}
		else
		{
			System.out.println("The given"+" "+name+" "+"is not a palindrom");
		}
	}

}
