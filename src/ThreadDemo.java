
public class ThreadDemo  implements Runnable{
public static void main(String[] args) {
	ThreadDemo td=new ThreadDemo();
	Thread t1=new Thread(td,"ram");
	Thread t2=new Thread(td,"shyam");
	Thread t3=new Thread(td,"aam");
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t3.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<4;i++)
	{
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread()+"  "+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
