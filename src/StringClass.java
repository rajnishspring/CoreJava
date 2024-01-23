import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringClass {
	
	public static void main(String[] args) {
		
		String as="WHAT ISSSSS THIS ?";
		HashMap<Character, Integer> hashMap=new HashMap<>();
		char[] ar=as.toCharArray();
		
		for(char c:ar)
		{
			if(hashMap.containsKey(c))
			{
				hashMap.put(c, hashMap.get(c)+1);
			}
			else 
				hashMap.put(c, 1);
			
		}
		System.out.println(hashMap);
	
		HashMap<Integer, List<Object>> hashMap1=new HashMap<>();
		hashMap1.put(1,new LinkedList<>());
		hashMap1.get(1).add(223);
		hashMap1.get(1).add(224);
		System.out.println(hashMap1);
		

	
	      String str = "vikkass hi hi low low to";
	      Map<String, Long> countOfEachCharacter = Arrays.stream(str.split(""))
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.err.println(countOfEachCharacter);

	
	
	}

}
