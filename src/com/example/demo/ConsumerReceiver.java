package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ConsumerReceiver {
	
	public static String getConsumer(Consumer<String> consumer)
	{
		//consumer.accept("ramu");
		return null;
	}

	
	public static void main(String[] args) {
		getConsumer(System.out::println);
		Consumer<String> consumer=System.out::println;
		String s=new String();
	Function<String,Integer> function1=(s1)->Integer.parseInt(s1.toLowerCase());
	Function<String,IntStream> function12=String::chars;
	Function<String,String> function=String::toLowerCase;
			//System.out::println;
	//	Runnable run=System.out::println;
//		Strings=String::valueOf;
		//System.out
		
	//	getConsumer((s)->{System.out.println(s)});
	}
}
