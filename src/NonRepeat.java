
public class NonRepeat {
	public static void main(String[] args) {
		String name ="D1csachin s";
		System.out.println(name.indexOf("c"));
		//System.out.println(name.lastIndexOf("c"));
		//System.err.println(name.lastIndexOf("c"));
		boolean flag=false;
		char ch1=' ';
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<=name.length()-1;j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					flag=true;
					System.err.println(name.charAt(j));
					break;
				}
				if (flag)
				break;
			}
			
			
			
		}
	}
	}


