package com.interview.rsys;

public class SeconDMAx {

	public static void main(String[] args) {

		int arr[] = { 6, 4, 1, 7, 9 };

		int max = 0;
		int secMax = 0;
		if (arr[0] > arr[1]) {
			max = arr[0];
			secMax = arr[1];
		} else {
			max = arr[1];
			secMax = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] < max && arr[i] > secMax) {
				secMax = arr[i];
				if (arr[i] > secMax && arr[i] > max) {
					secMax = max;
					max = arr[i];

				}
			}
		}
		System.out.println(secMax);
	}
}
