package RahulShettyPrograms;

public class ReverseNumber
{

	public static void main(String args[])
	{
		
		int a=242;
		int temp=a;
		int reverse=0;
		
		while(a!=0)
		{
			
			int n=a%10;
			reverse=n+reverse*10;
			a=a/10;
			
		}
		System.out.println(reverse);
		
		if(reverse==temp)
		{
			System.out.println("palindrome");
		}
		
		
		else
		{
			System.out.println("Not palindrome");
		}
	}
}
