import java.util.HashSet;
import java.util.Set;

class EMP1
{
	private String name;
	public boolean equals (Object o)
	{return true;}
}
public class XYZ {

	public static void main(String[] args) {
		EMP1 emp1=new EMP1();
		EMP1 emp2=new EMP1();
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		
		String str="greekforgrre";
		Set s=new HashSet();
		String newdata="";
		System.err.println(s.add(1));System.err.println(s.add(1));
		
		for(int i=0;i<str.toCharArray().length;i++) {
			System.out.println(s.add(str.toCharArray()[i]));
			if(s.add(str.toCharArray()[i])) {
				newdata+=str.toCharArray()[i];
			}
		}
		System.out.println("setData ::"+s +"::String Data ::"+newdata);
			
		
	}
}
