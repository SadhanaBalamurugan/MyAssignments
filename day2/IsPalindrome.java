package week1.day2;

public class IsPalindrome {
	public static void main(String[] args) {
		int input = 755512;
	
		int output=0;
		for (int i=input;i>0;)
		{
			output = (output*10) + (i%10); 
			i=i/10;
			
			
		}
		if (input==output)
		{
			System.out.println(input + " " + "The number is palindrome");
	
		}
		else 
		{
			System.out.println(input + " " + "The number is not palindrome");
		}
			
			
			
	}

}
