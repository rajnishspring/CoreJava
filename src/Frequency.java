import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.filterClassObject.Emp;
@FunctionalInterface
interface one
{
	void show();
	default void sum()
	{
		System.out.println("sdfghjk");
	}
	default void sum1()
	{
		System.out.println("sdfghjk");
	}
}
public class Frequency {
	
	public static void main(String[] args) {
		
		String s=new String("bhaskar");
		s.concat("software");
		s=s.concat("solutions");
		s="bhaskarsoft";
		System.out.println(s);
		
		String s1="bhaskar";
		s1=s1.concat("software");
		
		System.err.println(s1);
		s1=s1.concat("solutions");
		//s1="bhaskarsoft";
		System.err.println(s1);
		
		String name="this is it is ?";
		Map<String ,Long> count=Arrays.asList(name.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(count);
		List<Emp> list=new ArrayList<>(); 
		list.add(new Emp("abc",2));
		list.add(new Emp("abc1",3));
		list.add(new Emp("abc2",4));
		list.add(new Emp("abc3",5));
		
		List<Emp> list22=list.stream().map((emp)-> new Emp(emp.getName(),0)).collect(Collectors.toList());
		System.out.println("**8   "+list22);
		List<String> list221=list.stream().map((emp)-> emp.getName()).collect(Collectors.toList());
		System.err.println(list221);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(2);
		l.add(2);
		l.add(4);
		Map<Integer,Long> map=l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List lll=new ArrayList<>();
		
		for(Map.Entry<Integer, Long> mm:map.entrySet())
		{
			lll.add(mm.getValue());
		}
		System.out.println(lll.get(lll.size()-1));
		System.out.println(map);
		System.out.println(map.keySet());;
		map.entrySet().forEach(a->System.out.println(a.getKey()+" ---->   "+a.getValue()));
		
	}

}
