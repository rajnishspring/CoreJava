package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Emp
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class FilterUsingLambda {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(12);
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(19);
		List<Emp> empList=new ArrayList();
		Emp emp1=new Emp();
		emp1.setAge(2);
		emp1.setName("Ram");
		Emp emp2=new Emp();
		emp2.setAge(22);
		emp2.setName("Ram2");
		empList.add(emp2);
		empList.add(emp1);
		
		List<Integer> listl=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
	//	List<Integer> listl=list.stream().sorted(Comparator.comparingInt().collect(Collectors.toList());
		System.err.println(listl);
		
		
		// 
		List<Integer> list1=list.stream().filter((i)->i>15).collect(Collectors.toList());
		System.err.println(list);
		System.err.println(list1);
		
		List<String> list22 = empList.stream()
				.map(empLocal -> empLocal.getName())
				.collect(Collectors.toList());	
		
		System.out.println("Printing filtered...");
		list22.forEach(t -> System.out.println(t));
	}
}
