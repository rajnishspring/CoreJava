 import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortStream {
public static void main(String[] args) {
	  List < Employeee1 > employees = new ArrayList < Employeee1 > ();
      employees.add(new Employeee1(10, "Aamesh", 30, 40));
      employees.add(new Employeee1(20, "Zohn", 50, 35));
      employees.add(new Employeee1(30, "Dom", 50, 45));
      employees.add(new Employeee1(40, "Cramod", 50, 50));
      employees.add(new Employeee1(40, "Cramod", 29, 50));

      List < Employeee1 > employeesSortedList1 = employees.stream()
          .sorted(Comparator.comparing(Employeee1::getAge).
        		  thenComparing(Comparator.comparing(Employeee1::getName))).
          collect(Collectors.toList());
      System.out.println(employeesSortedList1);
      List < Employeee1 > employeesSortedList11 = employees.stream().
    		  distinct().collect(Collectors.toList());
      System.err.println("===="+employeesSortedList11);

      
      List < Employeee1 > sortedList = employees.stream()
    	        .sorted((o1, o2) -> {
    	            if(o1.getAge() == o2.getAge())
    	                return o1.getName().compareTo(o2.getName());
    	            else if(o1.getAge() > o2.getAge())
    	                return 1;
    	            else return -1;
    	        })
    	        .collect(Collectors.toList());
      System.out.println("====="+sortedList);
		/*
		 * List < Employee > sortedList = employees.stream() .sorted((o1, o2) -> {
		 * if(o1.getAge() == o2.getAge()) return o1.getName().compareTo(o2.getName());
		 * else if(o1.getAge() > o2.getAge()) return 1; else return -1; })
		 * .collect(Collectors.toList()); System.out.println("====="+sortedList);
		 */      
      
      employees.stream().sorted();
      
      
      List < Employeee1 > employeesSortedList2 = employees.stream()
          .sorted((e1,e2)->e2.getName().compareTo(e1.getName())).collect(Collectors.toList()); //ascending order
      
      List < Employeee1 > employeesSortedList22 = employees.stream()
    		  .sorted((e1,e2)->e2.getAge()-(e1.getAge())).distinct().collect(Collectors.toList()); //ascending order
      
      
      
      
      
      System.err.println(employeesSortedList2);
      System.err.println(employeesSortedList22);
  }
}

