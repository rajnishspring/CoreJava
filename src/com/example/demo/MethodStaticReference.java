package com.example.demo;
@FunctionalInterface
interface MyInterface
{
	  int show(); 
}
class MuInterface2
{
	static int  show1()
	{
		return 44;
	}
	static void  show2()
	{
		System.out.println("show2");
	}
 
}
public class MethodStaticReference {
public static void main(String[] args) {
	MyInterface mu=MuInterface2::show1;
	System.out.println(mu.show());
}
}
