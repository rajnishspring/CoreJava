package com.example.demo;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerImplDemo {
public static void main(String[] args) {
	Consumer<String> consumer=(String s)->{
		for(int i=0;i<4;i++)
		System.out.println("This is "+s+i);
	};
	consumer.accept("Ram");
	Supplier<Long> supplier=()->System.currentTimeMillis();
	System.out.println(supplier.get());
}
}
