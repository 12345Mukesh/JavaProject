package RahulShettyPrograms;

import java.util.ArrayList;

public class EliminateDuplicatesAndPrintUniqueNumbers {

	public static void main(String[] args) 
	{
	   int a[]= {4,5,5,5,4,6,6,9,8,3,3,4,5};
	   
	  
	
	   ArrayList<Integer> al= new ArrayList<>();
	   
	   for(int i=0;i<a.length;i++)
	   {
		   int k=0;
		   
		   if(!al.contains(a[i]))
		   {
			   al.add(a[i]);
			   k++;
			   
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]==a[j])
				   {
					   k++;
				   }
			   }
			 
			   System.out.println(a[i]+"-->"+k);
			   
		   }
		  
		   if(k==1)
			   System.out.println("It is unique number");
			   
	   }

	  
	}

}
