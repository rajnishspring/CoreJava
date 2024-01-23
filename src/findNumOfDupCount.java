import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findNumOfDupCount {
	public static void main(String[] args) {
		/*
		 * List <Integer> list=new ArrayList(); list.add
		 */

		int a[] = { 1, 1, 5, 3, 7, 5, 8, 9, 2, 7, 9 };
		Integer b[] = { 1, 1, 5, 3, 7, 5, 8, 9, 2, 7, 9 };
		String s[] = { "ab", "aa", "bc", "dc", "aafg", "kdlg" };
		// findNumOfDupCount(a);
		findNumOfDupCountByJava8(b);
		 findNumOfDupCountByJava8secApproach(s);
		findNumOfDupCountvalueusinCollections(b);
		
		
		//
		List<Integer> nums = Arrays.asList(1,2,1,3,4,5,5);
		Set<Integer> set	=new HashSet();
		Set <Integer>s2=nums.stream().filter(x-> !set.add(x)).collect(Collectors.toSet());
		Set <Integer>s3=nums.stream().filter(x-> set.add(x)==false).collect(Collectors.toSet());
		System.out.println("Set2 ::"+s2);
		System.out.println("Set3 ::"+s3);
	List distinctdata	=nums.stream().distinct().collect(Collectors.toList());
	System.out.println("distinctdata ::"+distinctdata);
		
	}

	private static void findNumOfDupCountvalueusinCollections(Integer[] b) {
		List<Integer> list = Arrays.asList(b);
		Collections.frequency(list, 1);

	}

	private static void findNumOfDupCountByJava8secApproach(String[] b) {
		List<String> list = Arrays.asList(b);
		Map<String, Integer> map1 = list.stream().collect(Collectors.toMap(Function.identity(), String::length));

		map1.entrySet().stream().forEach(
				entry -> System.out.println("Key data   " + entry.getKey() + "   NumberOfchar ::" + entry.getValue()));

	}

	private static void findNumOfDupCountByJava8(Integer[] a) {
		List<Integer> list = Arrays.asList(a);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// reterive msp using java8
		map.forEach((k, v) -> System.out.println("Key::" + k + "Value ::" + v));

		// 2nd approch reterive map using java8
		map.entrySet().stream().forEach(
				entry -> System.out.println("Key by 2nd approch::" + entry.getKey() + "Value ::" + entry.getValue()));

	}

	@SuppressWarnings("unchecked")
	private static void findNumOfDupCount(int c[]) {
		System.out.println("Length of Data ::" + c.length);
		for (int a : c) {
			System.out.println("arraydata ::" + a);
		}
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			System.out.println("map.containsKey::" + c[i] + "::" + map.containsKey(c[i]));
			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
				System.out.println("Inside If map value ::" + map);
			} else {
				map.put(c[i], 1);
				System.out.println("Inside else map value ::" + map);
			}
		}
		System.out.println("Result ::" + map);

	}

}
