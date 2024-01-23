package com.example.filterClassObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterUsingStream {
	public static void main(String[] args) {
		Predicate<Emp> con1 = emp -> emp.getAge() == 1;
		System.out.println("con1"+con1.toString());
		Predicate<Emp> con2 = emp -> emp.getAge() == 4;
		Predicate<Emp> con3 = emp -> emp.getName().equals("ram1");
		Predicate<Emp> con4 = emp -> emp.getName().equals("ram");
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("raam", 1));
		list.add(new Emp("shyam", 2));
		list.add(new Emp("raam1", 1));
		list.add(new Emp("shyam2", 1));
		list.add(new Emp("ram3", 3));
		list.add(new Emp("ram1", 4));// emp -> emp.getAge() == 1) || emp -> emp.getAge() == 4
		List<Emp> list1 = list.stream().filter((emp) -> emp.getAge() == 1).filter((emp) -> emp.getName().equals("raam"))
				.collect(Collectors.toList());
		List<Emp> list3 = list.stream().filter(con1.or(emp -> emp.getAge() == 4)).collect(Collectors.toList());
		List<Emp> list2 = list.stream().filter(con1.or(con2).or(con3).or(con4)).collect(Collectors.toList());
		System.err.println("list1"+list1);
		System.err.println("list1"+list2);
		System.err.println("list1"+list3);
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(e -> e.getName(), Emp::getAge));
		System.out.println(map);
	}
}
