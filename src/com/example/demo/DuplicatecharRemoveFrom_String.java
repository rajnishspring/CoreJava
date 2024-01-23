package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicatecharRemoveFrom_String {

	public static void main(String[] args) {
		String str = "grekofgreek";
		//removeDuplicate(str);
		removeDuplicateByMap(str);

	}

	public static void removeDuplicate(String str) {
		int index = 0;
		char[] ch = str.toCharArray();
		
		
		for (int i = 0; i <= ch.length; i++) {
			int j;
			for ( j = 0; j <= i; j++) {

				if (ch[i] == ch[j]) {
					break;
				}
			}
			
			if(j==i) {
				ch[index++]=ch[i];
			}
		}
		 System.out.println("Result::"+  String.valueOf(Arrays.copyOf(ch, index)));

	}
	public static void removeDuplicateByMap(String str) {
	char[] ch	=str.toCharArray();
	String st="";
		Map<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.toCharArray().length;i++) {
			if(!hm.containsKey(ch[i])) {
				st+=ch[i];
				hm.put(ch[i], 1);
			}
		}
		System.out.println("map ::"+ st);
			
		
	}

}
