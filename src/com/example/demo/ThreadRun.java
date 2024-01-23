package com.example.demo;
@FunctionalInterface
interface Commmon
{
	public int calculate(int a, int b);
	
}

public class ThreadRun {

	public static void main(String[] args) {
		Commmon c=(a,b)-> a*b;
	System.out.println(	c.calculate(20, 30));
	new Thread(()->{
		for(int i=0;i<20;i++)
		System.out.println("this is thread");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	).start();
	for(int i=0;i<20;i++)
		System.out.println("this is  Main thread");
	}
}
