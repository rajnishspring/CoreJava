import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestString {

	public static void main(String[] args) {
		String s="kgloballogicai";
		
		
		LinkedHashSet s1=new LinkedHashSet<>();
		ArrayList<String> al=new ArrayList<>();
		
	//String al1=Arrays.asList(s.split("")).stream().filter(x->s1.add(x)==false ).collect(Collectors.toSet()).iterator().next();
	
		//String al1=Arrays.asList(s.split("")).stream().filter(x->al.add(x) ).collect(Collectors.toList()).get(0);

		//System.out.println((String)al1.get(0));
	Set<String> ll=Arrays.asList(s.split("")).stream().filter(x->s1.add(x)==false ).collect(Collectors.toSet());
	Set<String> al1=Arrays.asList(s.split("")).stream().filter(x->!s1.add(x) ).collect(Collectors.toSet());
	
	System.err.println(ll);
System.out.println(al1);
	
	//al1.toArray()[0];
	}
}
