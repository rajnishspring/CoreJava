package org.test;

public final class Test {
	
	
	
	
public static void main(String[] args) {
	int arr[]= {4, 5, -2, 3, 1, 2, 6, 6 };
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
	}
	for(int a:arr)
		System.err.print(a+" ");
	
	
	  int sum=0; for(int i=arr.length-4;i<arr.length;i++) { sum=sum+arr[i]; }
	  System.out.println(sum);
	 
}
}
