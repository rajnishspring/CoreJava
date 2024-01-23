import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.function.ToLongFunction;

public class MAxBy {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int ar[]= {4,3,2,5,35,3,5,35,3,53,5,3,6};
	//OptionalLong b;
		//	List<int[]> l=Arrays.asList(ar);
	//	List<Integer> l1=	(List<Integer>) Arrays.stream(ar);
	//	System.out.println(l.size());
	//	System.out.println(l1.size());
	//	System.out.println(l);
	//	OptionalLong a=Arrays.asList(ar).stream().mapToLong((ToLongFunction<? super int[]>) Function.identity()).reduce((x,y)->(a>b)?a:b);
		//OptionalInt a=Arrays.asList(ar).stream().mapToInt().reduce(Integer::max);
	//	System.out.println(a.getAsInt());
		String s=null;
		Optional o=Optional.of(s);
		System.out.println(o.isPresent());
//		System.out.println(o.empty());
		System.out.println(o.orElse("syso"));

	       
	}

}
