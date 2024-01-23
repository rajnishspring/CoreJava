package com.example.demo;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Consumer;

class GiveMeString

{
	static String convertString(int a, int b) {
		return "This is Ram -->" + (a * b);
	}
}

class ToUpperCase {
	public String convert(String s) {
		return s.toUpperCase();
	}
}

class ToArray {
	ToArray(String s)
	{
		System.out.println(s.toCharArray().length);
	}
	ToArray()
	{
		
	}
	
}
class BifunctionImpl implements BiFunction<Integer, Integer, String> {

	@Override
	public String apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return null;
	}

}

public class BifunctionMethodReference {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, String> function = (a, b) -> {
			return "This is " + (a + b);
		};
		System.err.println(function.apply(20, 4));
		BiFunction<Integer, Integer, String> function1 = GiveMeString::convertString;
		System.out.println(function1.apply(20, 30));
		ToUpperCase upperCase = new ToUpperCase();
		Function<String, String> function2 = (s) -> upperCase.convert(s);
		System.err.println(function2.apply("this is lower case"));
		Function<String, String> function3 = upperCase::convert;
		Function<String, String> function4 = String::toUpperCase;
		System.err.println(function4.apply("ramuaaappky"));
		System.out.println(function3.apply("barsaaat"));
		
		Consumer<String> consumer=s->System.out.println(s.toUpperCase());
		consumer.accept("ramua");
		/*
		 * Consumer<String> consumer1=(s)->new ToArray(s) ;
		 * consumer1.accept("ramuaeer");
		 */
		Consumer<String> consumer13=ToArray::new ;
		consumer13.accept("123456");
	//	Function<String, char[]> function4=(s)->
	}
}
