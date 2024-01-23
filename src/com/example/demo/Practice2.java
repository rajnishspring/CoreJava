package com.example.demo;

interface Addition
{
	public int add (int a, int b);
}
public class Practice2 {
public static void main(String[] args) {
	Addition add=(int a,int b)-> {return (a+b);};
	System.out.println(add.add(201, 301));
}
}
