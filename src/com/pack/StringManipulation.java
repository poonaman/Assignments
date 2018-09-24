package com.pack;

public class StringManipulation 
{
	public static void main(String[] args) 
	{
		String s="He is a very very good boy,isn't he?";
		char s1[]=s.toCharArray();
		for(int i=0;i<=s.length();i++)
		{
			if(s.contains("  ")||s.contains(" ")||s.contains(",") ||s.contains("?")||s.contains("'"))
			{
				System.out.println();
			}
				
			else
			{
				System.out.print(s.charAt(i));
			}
		}

}
}
