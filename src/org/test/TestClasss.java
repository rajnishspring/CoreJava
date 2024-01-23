package org.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClasss  {
	

	
public static void main(String[] args) throws IOException {

	String value = "My name is Sachin";
	Map<String, Long> map=Arrays.asList(value.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
List l=new ArrayList<String>();
l.add("a");
l.add("b");
l.add("c");
l.add("d");
List l1=new ArrayList<String>();
l1.add("a");
l1.add("b1");
l1.add("c");
l1.add("d3");
List ll=(List) l.stream().filter(n->l1.contains(n)).collect(Collectors.toList());
System.out.println(ll);
}
}
