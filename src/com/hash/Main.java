package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	Map<WithOutHashCode, Integer> map=new HashMap<WithOutHashCode,Integer>();
	WithOutHashCode w1=new WithOutHashCode();
	w1.setB("first");
	WithOutHashCode w2=new WithOutHashCode();
	w2.setB("second");
	map.put(w1, 1);
	map.put(w2, 1);
	map.entrySet().forEach(System.out::println);
	map.entrySet().forEach(a->System.err.println(a.getKey()+""+a.getValue()));
	map.entrySet().forEach(e->e.getValue().equals("first"));
}
}
