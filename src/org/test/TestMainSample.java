package org.test;

import java.util.ArrayList;
import java.util.List;

public class TestMainSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hi Sachin how sachin are sachin you";
//uo ynihca ser 
String arr[]=s.split(" ");

int count =0;
for(String name:arr)
{
	if(name.equalsIgnoreCase("sachin"))
	{
		count++;
	}
	
}
System.out.println(count);
	
char c[]=s.toCharArray();
List list=new ArrayList<Character>();
for(int i=c.length-1;i>=0;i--)
{
	
System.out.println(c[c.length-1]);
}
		
		
	}

}
