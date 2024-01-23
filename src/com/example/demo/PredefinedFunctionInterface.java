package com.example.demo;

import java.util.function.Function;

class FunctionImpl implements Function<String ,Integer>
{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class PredefinedFunctionInterface {
	public static void main(String[] args) {
		Function<String ,Integer> impl=	(s)->s.length();
		System.out.println(impl.apply("ram123"));
	}

}
