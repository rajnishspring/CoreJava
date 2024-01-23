package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

abstract class Parent implements MyInterface1
{
	@Override
	public void show()
	{
		
	}
}

 interface MyInterface1 
 {
	 void show();
 }

public class TestClass {
	
	public static void main(String[] args) {
		
		String ar[]= {"Manoj", "Aman", "Ballu", "Manu", "Syam", "Ram", "Harry", "Tara", "Campy"};
	List<String> name=	Arrays.asList(ar).stream().sorted().collect(Collectors.toList());
	System.out.println(name);
	
	String names="Harry wants to carve out a niche for himself in the Harry field of Information Technology Harry by making significant Harry contributions and Harry wants to Harry pursue a Harry career with promising Harryand growing IT HarryCorporation.";
	       Map<String ,Long> map= Arrays.asList(names.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       System.out.println(map);
	      String m= map.entrySet().stream().max(Comparator.comparing(Entry::getValue)).get()
           .getKey();
	       System.err.println(m);
	   //    map.entrySet().stream().sorted((k,v)->k.getValue().compareTo(null))
	       String mx=   map.entrySet().stream().max(Comparator.comparing(b->b.getValue())).get()
           .getKey();
	       System.out.println(mx);
	       
	       
	       List<Map.Entry<String, Long>> l=new ArrayList<Map.Entry<String, Long>>(map.entrySet());
	       Collections.sort(l,new Comparator<Map.Entry<String, Long>>() {


		

			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
	      System.out.println(l.get(0).getKey()); 
	      
	      Long max=1L;
	      int index=0;
	      for(Map.Entry<String, Long> me:map.entrySet())
	      {
	    	 if(max<=me.getValue()) 
	    	 {
	    		 max=me.getValue();
	    		 map.get(me.getKey());
	    		 
	    	 }
	      }
	      final Long x=max;
	    List<String> ll=  map.entrySet().stream().filter(k->(k.getValue()==x)).map((m1)->m1.getKey()).collect(Collectors.toList());
	System.out.println(ll);
	}

	
	
	
}
