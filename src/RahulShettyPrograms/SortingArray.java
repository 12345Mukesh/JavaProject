package RahulShettyPrograms;

public class SortingArray 
{
   public static void main(String args[])
   {
	   
	   
	   int a[]= {2,6,13,4,9};
	   int temp;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   //Ascending order
			   //if(a[i]>a[j])
				   
				//Descending order
				   if(a[i]<a[j])
			   {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
			   
			   
		   }
	   }
	   
	   
	   for(int k=0;k<a.length;k++)
	   {
		   System.out.println(a[k]);
	   }
   }
	
	
	
}
