package com.interview.rsys;

public class PrintStar {
public static void main(String[] args) {

	for(int i=0;i<9;i++)
	{
		for(int k=0;k<(9)-i;k++)
		{
			System.out.print("  ");
		}
		//1,3,5,7,9 2*1=1
		for(int j=1;j<=(i*2)+1;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}


	
}
}
