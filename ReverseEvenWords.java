package week3.Homework;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		/* Declare the input */
		String test = "I am a software tester";
		
		/* Split the sentence into any string array */
		String[] words = test.split(" ");
		
		int arrayLength = words.length;
		
		for (int i = 0;i<arrayLength;i++)
		{
			
			if(i%2!=0)
			{
				char[] charArray = words[i].toCharArray();
				int charLength = charArray.length;
				int k= 0;
				char[] reverseString = new char[charLength];
				for(int j=charLength-1;j>=0;j--)
				{
					reverseString[k]=charArray[j];
					k++;
				}
				
				System.out.print(reverseString);
				
				
			}
			else
			{
				System.out.print(words[i]);
				
			}
		}

	}

}
