package string;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		String s="SHRADDHA";
		System.out.println(reverse(s));
		
	}
	
	public static String reverse(String rev)
	{
		String ans="";
		for(int i=rev.length()-1;i>=0;i--)
		{
			ans+=rev.charAt(i);
		}
		return ans;
		
	}

}
