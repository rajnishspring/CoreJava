
public class BinarySearch {
	static void search(int num,int f,int l,int ar[])
	{
		int mid=(f+l)/2;
		while(f<l)
		{
			if(num==ar[mid])
			{
				System.out.println("num is at"+mid);
				break;
			}
			else	if(num>ar[mid])
			{
				f=mid+1;
			}
			else if(num<ar[mid])
			{
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		
	}
public static void main(String[] args) {
	int ar[]= {3,4,5,6,7,8,9,12,14};
	int f=0;
	int l=ar.length-1;
	int num=7;
	search(3, f, l, ar);
	
}
}
