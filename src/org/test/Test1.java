package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@FunctionalInterface
interface Myfuntion<T>
{
	
	T show(T s);
}

public class Test1 {
	

public static void main(String[] args) {
	
	int ar[]= {3,6,7,2,1};
	List l=new ArrayList<Integer>();
	l.add(22);
	l.add(20);
	l.add(26);
	l.add(12);
	
	List x=(List) l.stream().sorted().collect(Collectors.toList());
System.out.println(x.get(x.size()-1));
	Myfuntion t=(s)->{
	System.out.println("this is shpow"+s);
	return "x";
	};
System.out.println(t.show("fff"));
	

}
}
