package org.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={12,3,5,7,7,9};
		  List l=  Arrays.asList(12,3,5,7,7,9).stream().filter(i->i%2==0).collect(Collectors.toList());
		  System.out.println(l);
		  
		  
	}

}
