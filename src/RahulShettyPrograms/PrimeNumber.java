package RahulShettyPrograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int val=23;
		int count=0;
		boolean flag= false;
		for(int i=2;i<=val;i++)
		{
			if(val%i==0)
			{
				flag=true;
				count++;
				break;
			}
			
		}
		if(count<=2)
		{
			System.out.println("prime");
		}	
			else
				System.out.println("not prime");
			
		
		
		
		
	}

}
