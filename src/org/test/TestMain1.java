package org.test;

class A
{
	
	int a=3;
	int b=4;
	int sum (int a, int b)
	{
		System.out.println(this.a+"    "+b);
		return this.a+b;
	}
	
}
class B extends A
{
	
	int a=30;
	int b=40;
	int sum (int a, int b)
	{
		System.out.println(this.a+"    "+super.b);
		return this.a+super.b;
	}
	
}




public class TestMain1 {
	public static void main(String[] args) {
		
		A a=new B();
		a.sum(20, 30);
		
	}

}
