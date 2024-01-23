
import java.util.*;

public class FindFirstCharoccuranceInString {

	public static void main(String[] args) {
		
		
		String str = "my name is rajnish";
		withoutCollection(str);
		Map<Character, Integer> map = new HashMap();

		char[] ch  = str.replaceAll("\\s", "").toCharArray();
		

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
			
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		for (char c : ch) {
			if (map.get(c) > 1) {
				System.out.println("First Repeated Character In '" + str + "' is '" + c + "'");
			} else {
				System.out.println("First non Repeated Character In '" + str + "' is '" + c + "'");
				break;

			}
		}

	}

	private static void withoutCollection(String str) {
		boolean flag = true; 
		for(char ch : str.toCharArray()) {
			System.out.println(str.indexOf(ch)+ "   "+str.lastIndexOf(ch));
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First non-repeating character is: "+ ch);
                flag = false;
                break;
			}
		}
        if(flag)
            System.out.println("There is no non repeating character in input string");
	}
    }

		
	
