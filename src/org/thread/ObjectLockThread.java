package org.thread;

class ThreadObj 
{
static synchronized	void loop()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


static synchronized void  show1()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("show  --->"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

public class ObjectLockThread extends Thread {
	ThreadObj obj;
	
	public ObjectLockThread(ThreadObj obj) {
		super();
		this.obj = obj;
	}
	public void run()
	{
		this.obj=obj;
		obj.loop();
		obj.show1();
	}
	public static void main(String[] args) {
		
		ThreadObj obj=new ThreadObj();
		ObjectLockThread thread=new ObjectLockThread(obj);
	
		ObjectLockThread thread1=new ObjectLockThread(obj);
		thread.start();
		thread1.start();
	}

}
