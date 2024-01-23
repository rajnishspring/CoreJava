import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Split {
public static void main(String[] args) {
	String s="ram  shyam";
	List<String> x=Arrays.asList(s.split("")).stream().filter(c->!c.equals(" ")).distinct().sorted().collect(Collectors.toList());
	System.out.println(x);
	String h[]=s.split(",");
	System.err.println(h.length);
	for(String b:h) {
		System.out.println(b);
		
		
		int var1=2;
		int var2=3;
		if((var1=3)==var2)
		{
			System.err.println("true");
			
		}else
		{
			System.out.println(++var2);
		}
	}
}
}
