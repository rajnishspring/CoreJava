import java.util.ArrayList;
import java.util.List;

public class SumOfNumberInList {
	public static void main(String[] args) {
		int arr[]= {2,4,7,3,5,2,4};
		List<Integer> l=new ArrayList();
		l.add(2);
		l.add(4);
		l.add(6);
		l.add(8);
		l.add(6);
		l.add(12);
		l.add(12);
		l.add(30);
		
		//yyyvvvvvf
		int sum= l.stream().reduce(0,(a,b)->{return a+b;});
		System.out.println(sum);
	}
	}
