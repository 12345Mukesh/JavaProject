package RahulShettyPrograms;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args)
	{
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter array Size : ");

	    int Size = s.nextInt();
	     int a[]= new int[Size];
		
	     
	    	      
	       System.out.println("Enter array elements : ");
	       for(int i=0; i<Size; i++){
	           a[i] = s.nextInt();
	       }
	     
	     int sum=SumArray(a);
	     System.out.println(sum);
		
		
	}

	public static int SumArray(int[] a) 
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(sum);
			sum=sum+a[i];
		}
		
		return sum;
	}

}
