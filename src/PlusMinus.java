import java.util.HashMap;
import java.util.Map;

public class PlusMinus {

	static String to()
	{
		String str="plusMinUSpLUsminuSPLusPLUSMinusplusplus";
		System.err.println("char length ::"+str.toCharArray().length);
		System.err.println(str.length());
		str=str.toLowerCase();
		Map<String,Character> map=new HashMap<>();
		map.put("plus",'+');
		map.put("minus",'-');
		StringBuffer result=new StringBuffer();
		String temp="";
		for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		temp=temp+ch;
		System.out.println(temp);
		if(map.containsKey(temp)){
		result.append(map.get(temp));
		temp="";
		}
		
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(to());
	}
}
