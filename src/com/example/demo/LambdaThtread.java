package com.example.demo;
class Mythread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class LambdaThtread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=()->{for(int i=0;i<5;i++)
		{
			System.out.println("--->"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}};
		Thread t=new Thread(runnable);
		t.start();
		
	//	t.stop();
		for(int i=0;i<5;i++)
		{
			System.out.println("--333>"+i);
			Thread.sleep(500);
		}
	}
}
