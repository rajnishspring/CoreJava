package com.example.demo;

import java.util.stream.Stream;

public class StreamApi {
	
	public static void main(String[] args) {
		Stream<String> s=Stream.of("s","b","c","d","e","f");
	//	s.forEach((s1)->System.out.print(s1));
		s.forEach(System.out::print);
	}

}
