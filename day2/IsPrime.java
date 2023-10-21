package week1.day2;

public class IsPrime {
	
	public void prime()
	{
    int i=10;
    boolean checkPrime = true;
		for (int j=2;j<i-1;j++)
		{
			if(i%j==0)
			
			checkPrime = false;
			break;
			
		}
		if(checkPrime==true)
		{
			System.out.println(i + " " + "is prime");
		}
		else
		{
			System.out.println(i + " " + "is not prime");
		}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
IsPrime a = new IsPrime();
a.prime();




	}

}
