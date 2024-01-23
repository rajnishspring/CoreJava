package org.test;

public class TestString {

	public static void main(String[] args) {
		
	
	String s="I am sachin from madhubani bihar";
//	output string ="Bihar Madhubani From Sachin Am I";


	String arr[] =s.split(" ");

	String temp="";
	for(int i=0;i<arr.length/2;i++)
	{

	
	temp=arr[arr.length-1-i];
	arr[arr.length-1-i]=arr[i];
	arr[i]=temp;
	}
char c[]=temp.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
	arr[i].substring(0).toUpperCase();
	}

	for(String ss:arr)
	{

	System.out.print(ss);
	}

	
	}
}
