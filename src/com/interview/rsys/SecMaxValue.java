package com.interview.rsys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecMaxValue {
public static void main(String[] args) {
	int [] a= {2,5,8,1,4,10,17};
	getSecMax1(a);
	//getSecMaxbyArrays(a);
	//getSecMaxbyCollections(a);
	Integer [] b= {98,33,11,40,83,56};
	//int result= secondLargestNumberInArray(b);
	//System.out.println("secMax ::"+result);
	
}
static void getSecMaxbyArrays(int []arr) {
	Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
}
static void getSecMaxbyCollections(int []arr) {
	List lt=Arrays.asList(arr);
	Collections.sort(lt);
	Object[]a=lt.toArray();
	System.out.println(lt);
}

 static int secondLargestNumberInArray(Integer[] numbers) {
    return Arrays.stream(numbers).sorted(Collections.reverseOrder()).skip(1).findFirst().get();
}

 static void getSecMax1(int []arr) {
	 
	 int temp=0;
	 for (int i=0;i<arr.length;i++) {
		 for (int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]) {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 
		 }
	 }
	 System.out.println("SecMAx ::"+arr[arr.length-2]);
	 System.out.println("SecLowest ::"+arr[1]);
	
}
}
