package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
	int range = 10;
	int n1=-1;
	int n2=1;
	for (int i=0;i<range;i++)
	{
	int n3 = n1+n2;
	System.out.println(n3);
	n1 = n2;
	n2 = n3;
	
	
	}
	

}
}
