import java.util.Iterator;

public class FabonicSeriesBYRecursion {

	public static void main(String[] args) {
		//findfibSeries(5);
		//int result=findfibSeriesByRecursive(5);
		for (int i = 0; i < 5; i++) {
		      System.out.print(fibRecursion(i) + " ");
		    }

	}

	private static int fibRecursion(int count) {
		 if (count == 0) {
		      return 0;
		    } // Oth fibonacci is 0

		    if (count == 1 || count == 2) {
		      return 1;
		    } // 1st and 2nd Fibonacci are 1 and 1 only

		    // calling function recursively for nth Fibonacci
		    return fibRecursion(count - 1) + fibRecursion(count - 2);
		  }
	
		
	

	private static void findfibSeries(int n) {
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);

		}

	}

}
