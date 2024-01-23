
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Employeee1 {
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	private String name;
    private double salary;
    private int age;
    private int dept;

    public Employeee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employeee1(String name, double salary ,int age) {
    	this.name = name;
    	this.salary = salary;
    }
    public Employeee1(int dept,String name, double salary ,int age) {
    	this.name = name;
    	this.salary = salary;
    	this.dept=dept;
    	this.age=age;
    }

    public String getName() {
        return name;
    }
   

    public double getSalary() {
        return salary;
    }
	@Override
	public String toString() {
		return "Employeee1 [name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept + "]";
	}


}

public class UnioquelistSort {
    public static void main(String[] args) {
        // Create a list of employee entities
        List<Employeee1> employees = new ArrayList<>();
        employees.add(new Employeee1("John", 50000));
        employees.add(new Employeee1("Alice", 60000));
        employees.add(new Employeee1("Bob", 55000));
        employees.add(new Employeee1("John", 75000));
        employees.add(new Employeee1("Alice", 80000));

        // Sort the list distinctly by name
		/*
		 * List<Employeee1> distinctSortedByName = employees.stream() .sorted((e1, e2)
		 * -> e1.getName().compareTo(e2.getName())) .distinct()
		 * .collect(Collectors.toList());
		 */
        
		/*
		 * List<Employeee1> distinctSortedByName1 = employees.stream()
		 * .collect(Collectors.toCollection(() -> new
		 * TreeSet<>(Comparator.comparing(Employee::getName)))) .stream()
		 * .collect(Collectors.toList());
		 */
        
        // Use a Set to filter out duplicates while maintaining sorting
        List<Employeee1> distinctSortedByName = employees.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employeee1::getSalary))))
                .stream()
                .collect(Collectors.toList());


        // Print the sorted and distinct list
        distinctSortedByName.forEach(System.out::println);
       System.err.println( distinctSortedByName.get(2));
    }
}






