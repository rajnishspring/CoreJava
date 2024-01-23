package org.test.sample;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {

		int arr[] = { 2, 5, 4, 3, 4, 5, 56, 78, 66, 78 };
		int max = Integer.MIN_VALUE + 1;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
			if (arr[i] > max && arr[i] > secondMax) {
				secondMax = max;
				max = arr[i];
			}
		}
		System.out.println(secondMax);

		String s = "uaebcddadbbdi";

		char c[] = s.toCharArray();

		HashSet<Character> set = new HashSet<Character>();// bvvaa
		int count = 0;

		for (Character ch : c) {
			if (set.add(ch) == true && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {

				System.err.println(ch);
			}
		}

		LinkedHashMap<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			if (hMap.containsKey(c[i]) && (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')) {
				hMap.put(c[i], hMap.get(c[i]) + 1);
			} else {
				hMap.put(c[i], 0);
			}

		}
		System.out.println(hMap);

		for (Entry<Character, Integer> e : hMap.entrySet()) {
			if (e.getValue() == 0 && (e.getKey() == 'a' || e.getKey() == 'e'
					|| e.getKey() == 'i' || e.getKey() == 'o'
					|| e.getKey() == 'u'))
			{
				System.out.println("=======");
				System.out.println(e.getKey());
				break;
			}
		}
	}
}
