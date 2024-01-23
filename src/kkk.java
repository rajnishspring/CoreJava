// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class kkk {
    public static void main(String[] args) {
        
        // Input [1,2,3,4,5,6] = [6,2,3,4,5,1]
// Output [10,90] [60,40] [30,70]
        System.out.println("Hello, World!");
        HashMap hm=new HashMap<Integer,Integer>();
        int arr[] = {1,2,3,4,5,6,7};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++) {
        	arr[i-1]= arr[i];
        }
        arr[arr.length-1]= temp;
        for(int i:arr)
        {
    System.out.print(i+" , ");
        }
}}