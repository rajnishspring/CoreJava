package com.example.lambda;

public class ThreadDemoWithLambda {
	

	public static void main(String[] args) throws InterruptedException {
	//	ThreadDemoWithLambda demoWithLambda = new ThreadDemoWithLambda();
		//Thread t1 = new Thread(demoWithLambda);
		//t1.start();
		//t1.join();

	/*
	 * @Override public void run() { // TODO Auto-generated method stub for for (int
	 * i = 0; i <= 100; i++) { if (i % 2 == 0) { System.out.println(i); } }
	 */

		new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0) {
					System.out.println("even ::" + i);
				} else {
					System.out.println("odd ::" + i);
				}
			}
		}).start();
	}
}
