package com.interview.practice;

import java.util.TreeMap;

public class StringPractice {
	public static void main(String[] args) {
/*		String expression = "15 + 12 - 5 + 14 - 9";
		
		 * String ar[]=expression.split("+"); for(String s:ar) { System.out.println(s);
		 * }
		 
		String exp=	expression.replace('+' , ' ');	
		System.out.println(exp);
		char ch[]=expression.toCharArray();
		for(char c:ch)
		{
		if(c=='1'||c=='2')
		{
			String s=new String(c);
		}
		}
	}\*/
		
		String expression = "15+12-2";
		String [] v1=expression.split("[-*+/]");
		
		for(String g:v1)
		{
			System.err.println(g); 
		}
		int c1=Integer.parseInt(v1[0]);;
		int y=0;
		String xx="ramu";
		char ch='r';
		String ccv=xx+ch;
		System.out.println(ccv);
		
		for(int z=0;z<v1.length-1;z++)
		{
			int b=Integer.parseInt(v1[z]);
			y=y+v1[z].length();
			if(expression.charAt(y)=='+')
			{
				c1=b+Integer.parseInt(v1[z+1]);
			}
			if(expression.charAt(y)=='-')
			{
				c1=c1-Integer.parseInt(v1[z+1]);
			}
			if(expression.charAt(y)=='/')
			{
				c1=b/c1;
			}
			if(expression.charAt(y)=='*')
			{
				c1=b*c1;
			}
		}
		System.out.println("result"+c1);
		
		char sr[]=expression.toCharArray();
		int res=0;
		for(char c:sr)
		{
			String x ="";
			String s="";
			if(Character.isDigit(c))
			{
				x=x+c+"";
				System.out.print(x);
				 s=new String(x);
			}
			else 
			{
				int no=0;try {
				System.err.print(s);
				
				no=Integer.parseInt(s.trim());
				}catch(Exception e)
				{
					System.out.println("xxx");
					System.out.println(e);
				}
				if(c=='+')
				{
					res=no+res;
				}
				if(c=='-')
				{
					res=res-no;
				}
			}
		}
		System.out.println(res);
	
	String personData = "ram:52#manohar:45#vikas:45#manu:15#rajan:32#vinod:65";
//	String contains person name with their age, please print name according to their age in descending order

	String ar[]=personData.split("#");
	TreeMap<Integer,String> map=new TreeMap<>();
	for(String  person:ar)
	{
		
		String nameAndAge[]=person.split(":");
		
		map.put(Integer.parseInt(nameAndAge[1]), nameAndAge[0]);
		
		
		
		
	}
	System.out.println(map);
	map.forEach((k,v)->System.out.println(k+""+v));
	
}}
