package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("c");
		l.add("b");
		l.add("d");
		l.add("a");
		l.add("g");
		System.err.println("before sorted  --> "+l);
		List l1=l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l1);
		l1.forEach(System.err::print);
		ArrayList<Integer> li=new ArrayList<>();
		li.add(12);
		li.add(2);
		li.add(8);
		li.add(5);
		li.add(4);
		li.add(1);
		List l2=li.stream().sorted((r1,r2)-> {return (r1-r2);}).collect(Collectors.toList());
	System.out.println(l2);
	}

}
