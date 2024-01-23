package org.test.sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashMap1 {
	public static void main(String[] args) {
		// Create HashMap with multiple lists as values
		HashMap<String, List<Integer>> salariesMap = new HashMap<>();
		salariesMap.put("Department 1", Arrays.asList(50000, 60000, 70000));
		salariesMap.put("Department 2", Arrays.asList(80000, 90000, 100000));
		salariesMap.put("Department 3", Arrays.asList(55000, 65000, 75000));

		// Find highest salary using Java 8
		int highestSalary = salariesMap.values().stream().flatMap(n -> n.stream()).max((a, b) -> Integer.compare(a, b))
				.orElse(0);
		int highestSalary1 = salariesMap.values().stream().flatMap(n -> n.stream()).max((a, b) -> Integer.compare(a, b))
				.orElse(0);
		int sal = salariesMap.values().stream().flatMap(n -> n.stream()).sorted((a, b) -> a - b)
				.collect(Collectors.toList()).get(4);
		;
		System.err.println(sal);

		System.out.println("Highest salary: " + highestSalary);
		Collection<List<Integer>> l = salariesMap.values();
		l.forEach(System.err::print);
		// 5th highest number
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
		int n = numbers.stream().sorted((a, b) -> a - b).collect(Collectors.toList()).get(4);
		List n1 = numbers.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		Integer n2 = numbers.stream().sorted((a, b) -> b - a).collect(Collectors.toList()).get(4);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);

	}
}
