package org.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

class Student
{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}





public class SampleTest {
	public static void main(String[] args) {
		
		 String s1 = "Java";
		    String s2 = "Java";
		    StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("sneha",26));
		list.add(new Student("ajay",22));
		list.add(new Student("sneha",26));
		list.add(new Student("ajay",22));
		Student s11=new Student("ajay",22);
		Student s12=new Student("ajay",22);
		
		Map<Student,Integer> map=new HashMap<Student, Integer>();
		HashSet<Student> map1=new HashSet<Student>();
		System.err.println(map1.add(s11));
		System.err.println(map1.add(s12));
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		for(Student s:list)
		{
			if(map.containsKey(s))
			{
				map.put(s, 1);
				System.out.println(s);
			}
			else
			{
				map.put(s, 2);
			}
		}
		
	}

}
