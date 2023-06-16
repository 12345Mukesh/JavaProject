package RahulShettyPrograms;

public class MultiplicationWithoutMultiplyOperator
{
  public static void main(String args[])
  {
	  int result=multiply(6,10);
	  
	  System.out.println(result);
  }

public static int multiply(int i, int j)
{
	int sum=0;
	int k=1;
	//i has to sum itself j times to get result
	
	while(k<=j)
	{
		sum=sum+i;
		System.out.println(sum);
		k++;
	}
	return sum;
}
	
	
	
}
