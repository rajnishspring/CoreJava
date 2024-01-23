package com.example.lambda;
@FunctionalInterface
 interface MyInterface {
	
	public Integer show(int x);

}
public class Demo
{
	public static void main(String[] args) {
	MyInterface face=	(x)->{System.out.println("this is show");
	return x*x;};
	System.out.println(face.show(2));
	}
}