package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapForEach {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "ram");
	map.put(2, "shyam");
	map.put(3, "aam");
	for(Entry entry:map.entrySet())
	{
		System.out.println((Integer)entry.getKey()+" --> "+entry.getValue());
	}

Set s=map.keySet();
for(Integer s1:map.keySet())
{
	System.out.println(s1+" --> "+map.get(s1));
}

map.forEach((k,v)->{System.out.println(k+" --> "+v);});
System.out.println("***********************");
map.entrySet().forEach(System.out::println);
System.out.println("*****BySteram********");
map.entrySet().stream().forEach(e->{
	System.out.println("Key by ::"+e.getKey() +"value ::"+e.getValue());});
}
}
