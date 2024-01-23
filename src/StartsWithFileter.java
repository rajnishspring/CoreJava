 import java.util.Arrays;
import java.util.List;

public class StartsWithFileter {
	public static void main(String[] args) {
		List<String> l=Arrays.asList("Madhu","mona","Vicky");
		l.stream().filter(p->(p.startsWith("m")||p.startsWith("M"))).forEach(System.out::println);
		//l.stream().filter(p->(p.equalIgnoreCase().startsWith("m")).forEach(System.out::println);
	}

}
