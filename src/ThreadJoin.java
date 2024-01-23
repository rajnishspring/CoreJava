
public class ThreadJoin extends Thread {

	public ThreadJoin(String string) {
		// TODO Auto-generated constructor stub
	}

	public ThreadJoin() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		/*
		 * ThreadJoin t1=new ThreadJoin("ram"); ThreadJoin t2=new ThreadJoin();
		 * ThreadJoin t3=new ThreadJoin(); t1.start(); try { t1.join();
		 * System.out.println(Thread.currentThread().getName()); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * System.out.println(t1.currentThread().getName()); t2.start();
		 * 
		 * t3.start(); System.out.println(Thread.currentThread().getName());
		 */
		if (true) {

		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == 2 || j == 4) {

					System.out.print("1");
					// System.out.println();
				}

				else {
					System.out.print("0");

				}

			}
			System.out.println();
		}
	}
}
