package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

	private String name;
	private List<Integer> list=null;
	
	public ImmutableList(String name,List list) {
	this.name=name;
	//this.list=Collections.unmodifiableList(list);
	this.list=list;
	}
	
	public String getName() {
		return name;
	}

	public List<Integer> getList() {
		return list;
	}

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		String m="ram";
		ImmutableList im=new ImmutableList(m, l);
		List ll=im.getList();
		System.out.println(ll);
		ll.add(22);
		System.out.println(ll);
	}
}
