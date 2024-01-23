package com.example.demo;

public class ChangeString {

	public static void main(String[] args) {
		String ar="vicky@gmail.com";
		String ar1[]=ar.split("@");
		String s=ar1[0];
		System.out.println(s.substring(1, 5).replace( "icky","****"));;
	}
}
