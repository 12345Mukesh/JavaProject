package RahulShettyPrograms;

import java.util.ArrayList;

public class CompareTwoDiffArray {

	public static void main(String[] args)
	{
		
		int a[]= {1,4,5,7,8};
		int b[]= {6,5,4,1,8};
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
		    if(a[i]==b[j])
		    {
		    	//if we use array
//		    	int c[]= new int[a.length];
//		    	c[i]=a[i];
//		    	System.out.println(c[i]);
		    	
		    	//if we use array list
		    	 al.add(a[i]);
		    	
		    }	
		    	
		    }
		}
		
		
		Object [] c= al.toArray();
		for(Object ob:c)
		{
			System.out.println(ob);
		}
		
		
		
	}

}
