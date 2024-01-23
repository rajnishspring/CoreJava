import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListFilter {
public static void main(String[] args) {
	List<Integer> lit=new ArrayList<>();
	lit.add(2);
	lit.add(3);
	lit.add(4);
	lit.add(5);
	lit.add(6);
	Employee emp=new Employee(1,"  ram     ",31,34576);
	Employee emp1=new Employee(2,"ram1  ",33,34578);
	Employee emp2=new Employee(3,"ram2 ",29,34575);
	Employee emp3=new Employee(4,"ram3",21,34579);
	List<Employee> lits=new ArrayList<>();
	lits.add(emp3);
	lits.add(emp2);
	lits.add(emp1);
	lits.add(emp);
	List<String> name=lits.stream().filter((empp)->empp.getAge()>30).map((emp11)->emp11.getName().trim()).collect(Collectors.toList());
	System.out.println(name);
	System.out.println(name.get(1).length());
	List name1=lits.stream().filter((empp)->empp.getAge()>30).map((emp11)->new Employee(emp11.getId(),emp11.getName().trim(),emp11.getAge(),emp11.getSalary())).collect(Collectors.toList());
	System.out.println(name1);
	Map<Long, List<Employee>> map=lits.stream().collect(Collectors.groupingBy(Employee::getSalary));
	System.out.println(map);
	Map<Integer,Employee>map1=lits.stream().collect(Collectors.toMap(Employee::getId,Function.identity()));
	System.out.println(map1);
	System.out.println("-----------servosys------------");
	//get max value of salary
	List empservo=lits.stream().sorted((o1,o2)->{
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else
			return -1;
		
	}).collect(Collectors.toList());
	System.out.println("------empservo--------"+empservo);
	System.out.println("------empservo-get max salary-------"+empservo.get(3));
	/* need implemets the comparable interface in emp class and override compareto
	 * List empservo1=lits.stream().sorted().collect(Collectors.toList());
	 * System.err.println("------empservo1--------"+empservo1);
	 */
	System.out.println("-------------------------");
	lit.forEach(n->System.out.print(n));
	lit.forEach(n->{if(n%2==0) { System.err.print(n);}});
	System.err.println( );
	List l=lit.stream().filter(n-> (n>4)).collect(Collectors.toList());
	System.out.println(l);
}
} 
