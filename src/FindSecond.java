
public class FindSecond {
	public static void main(String[] args) {
		int ar[]= {53,39,38,6,86,58,7,4,17,37,3,6,101,102};
		int max=0;
		int secMax=-1;
		for (int i=0;i<ar.length;i++)
		{
			if((max>ar[i])&&(secMax<ar[i]))
			{
				//secMax=max;
				secMax=ar[i];
				
			}
			if((max<ar[i])&&(secMax<ar[i]))
			{
				System.out.println("max"+max);
				secMax=max;
				max=ar[i];
				
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		
		
	}

}
