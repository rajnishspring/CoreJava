import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumbers {
	
	
	//iv
	
	//II      ii    viii  iv   ix  x   xi  
	static int getNumericals(String num)
	{
		Map<Character ,Integer> map=new HashMap<Character ,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		int number =0;
		int temp=0;
		char ch[]=num.toCharArray();
		for(int i=ch.length-1;i>0;i--)
		{
		temp=map.get(ch[i]);
		
		
		
		}
		
		
		return 0;
	}
public static void main(String[] args) {
	/*
	 * I-1, II-2, III-3, IV-4, V-5, VI-6, VII-7, VIII-8, IX-9,X-10, XI-11,
	 * XII-12,XIII-13, XIV-14,XV-15,XVI-16, XVII-17,XVIII-18,XIX-19,XX-20,XXX-30,
	 * XL-40, L-50
	 */
	
	 HashMap<String, List<Integer>> map = new HashMap<>();

	 map.put("mango", new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
	 System.out.println(map.toString());
	// [mango=[1,2,3,4,5]]

	 List<Integer> test = map.get("mango");
	 test.remove(0);
	 System.out.println(map.toString());
	// [mango=[1,2,3,4,5]]
	
}
}
