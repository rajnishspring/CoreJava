
public class SreingExpression {
	
	static int count(String ar)
	{
		return String.valueOf(ar).length();
		
	}
	public static void main(String[] args) {
		String s="22+3-5+6";
		String ar[]=s.split("[-+*/]");
		//System.out.println(ar.length);
		
		int result =Integer.parseInt(ar[0]);
		//for(int i=0;i<ar.length;i++)
		//{
			System.err.println(count(ar[0]));
			System.out.println(s.charAt(count(ar[0])));
			/*
			 * if(s.charAt(count(ar[i]))=='+') {
			 * 
			 * }
			 */
		String v=new String("v");
		String c=new String("v");
		String b="v";
		String x="v";
		System.err.println(v==c);
		System.err.println(b==c);
		System.err.println(b==x);
	}

}
