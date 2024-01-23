import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfMaps {
	public static void main(String[] args) {

		Map map = new HashMap<String, Integer>();
		Map map1 = new HashMap<String, Integer>();
		Map map2 = new HashMap<String, Integer>();
		Map map3 = new HashMap<String, Integer>();
		Map map4 = new HashMap<String, Integer>();
		Map map5 = new HashMap<String, Integer>();
		Map map6 = new HashMap<String, Integer>();
		map1.put("ram", 2);
		map2.put("shyam", 2);
		map3.put("aam", 2);
		map4.put("ram", 3);
		map5.put("ram", 4);
		map6.put("ram", 4);
		List<Map<String, Integer>> l = new ArrayList<>();
		l.add(map4);
		l.add(map3);
		l.add(map2);
		l.add(map1);
		l.add(map5);
		l.add(map6);
		System.out.println(map);
		System.out.println(l);
		// List
		// v=l.stream().filter(k->k.entrySet().stream().filter(v->(v.getKey().equals("ram")))).map(k->k.getValue()).collect(Collectors.toList());

		List<Map<String, String>> listOfMaps;
		List<Integer> valuesMatchingKey = l.stream().filter(mapx -> mapx.containsKey("ram"))
				.map(mapx -> mapx.get("ram")).collect(Collectors.toList());
		Map<Integer,Long> valuesMatchingKey1 = l.stream().filter(mapx -> mapx.containsKey("ram"))
				.map(mapx -> mapx.get("ram")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<Map<String, Integer>> valuesMatchingKey2 = l.stream().filter(mapx -> mapx.containsKey("ram")).collect(Collectors.toList());
System.out.println(valuesMatchingKey);
System.out.println(valuesMatchingKey1);
System.out.println(valuesMatchingKey2);

	}
}
