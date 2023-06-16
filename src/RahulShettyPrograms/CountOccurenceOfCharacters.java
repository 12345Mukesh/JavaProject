package RahulShettyPrograms;

public class CountOccurenceOfCharacters {

	public static void main(String[] args)
	{
		int count=0;
	    String word="aaanidaaafkl";
	    char c='a';
	    
	    for(int i=0;i<word.length();i++)
	    {
	    	
	    	if(word.charAt(i)==c)
	    	{
	    		count++;
	    	}
	    }

	    System.out.println(count);
	    
	}

}
