import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash( name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return  Objects.equals(name, other.name);
	}
	

}

public class Test {

	public static void main(String[] args) 
	{
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp("sachin",29));
		l.add(new Emp("Deepak",21));
		l.add(new Emp("Ram",20));
		l.add(new Emp("sachin",30));
		l.add(new Emp("Shyam",14));
		
	List empList=	l.stream()
			.sorted((a,b)->a.getName().compareTo(b.getName())).distinct()
			.collect(Collectors.toList());
	
	System.out.println(empList);
	}

}
