
public class TestInt {
public static void main(String[] args) {
	//This is a string

 

 

//siht si a gnirts
	
	
	String s="This is a string";
	
/*	
	String arr[]=s.split(" ");
	StringBuilder sb=new StringBuilder();
	
	
	for(int j=0;j<arr.length;j++)
	{
	
	for(int i=0;i<arr[j].length();i++)
	{
		System.out.print(arr[j].charAt(arr[j].length()-i-1));
		
		
	}*/
	
	//[3:17 PM] Shashank Kumar Singh

//conjecture presented

//CoNjEcTuRe PrEsEnTeD
	
	String s1="conjecture perfect";
	String srr[]=s1.split("");
	StringBuilder sb=new StringBuilder();
	
	String s2[]=s1.split(" ");
	for(int j=0;j<s2.length;j++)
	{
	for(int i=0;i<s2[j].length();i++)
	{
		
		if(i==0||i%2==0)
		{
		
			sb.append(String.valueOf(s2[j].charAt(i)).toUpperCase());
			
					
		}
		else 
			sb.append(String.valueOf(s2[j].charAt(i)));
		
		
	}
	
	
	sb.append(" ");
	}

	System.out.println(sb);
}
}
