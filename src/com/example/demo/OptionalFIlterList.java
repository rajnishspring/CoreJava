package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

class Sample
{
	public Sample toSub()
	{
		return new Sample();
	}
}

class Ram
{
	public Object methoe() {
		return new Object();
	}
}

public class OptionalFIlterList {
	public static void main(String[] args) {
		//List<String> list=new ArrayList();
		Set<String> list=new HashSet<>();
		list.add("ram");
		list.add(" shyam");
		list.add("aam");
		list.add("balm ");
		//Optional<List> optional=Optional.of(list);
		Optional<Set> optional=Optional.of(list);
	//	Set<String> l=optional.filter(list1->list1.contains("ram"))//;
	//	System.out.println(l);
		Function<Sample, Sample> b=(s)->s.toSub();
		Function<Sample, Sample> b1=Sample::toSub;
		Function<Ram, Object> b4=Ram::methoe;
		System.out.println(b4.apply(new Ram()));
		Function<Ram, Object> b3=(r)->r.methoe();
		
	}

}
