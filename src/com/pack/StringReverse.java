package com.pack;
public class StringReverse
{
	public static void main(String[] args)
	{
		StringBuilder main=new StringBuilder("sd#%gt%$&dfsd");
		String name=Reverse(main);
		System.out.println(name);
		StringBuilder string =new StringBuilder("poonam");
		String name12=string.reverse().toString();
		System.out.println(name12);
	}
	public static String Reverse(StringBuilder main)
	{
		
		StringBuilder s1=new StringBuilder(main.substring(0,2));
		String s2=s1.reverse().toString();
		String s3=main.substring(2,4);
        StringBuilder s4=new StringBuilder(main.substring(4,6));
        String s5=main.substring(6,9);
        StringBuilder s6=new StringBuilder(main.substring(9,11));
        StringBuilder s7=new StringBuilder(main.substring(11,13));
        String s8=s6.reverse().toString();
       String s9=s4.reverse().toString();
      String s10=s7.reverse().toString();
      String s11=s2+s3+s8+s5+s9+s10;
      return s11;
	}
}
