package com.example.demo;

import java.util.function.Predicate;

public class PredicateS {
public static void main(String[] args) {
	Predicate<Integer> predicate=i->(i<20);
	System.out.println(predicate.test(12 ));
}
}
