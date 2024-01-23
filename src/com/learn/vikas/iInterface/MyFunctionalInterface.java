package com.learn.vikas.iInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

	void show();

	default void sum() {
		System.out.println("sum method");
	}

	static void sum1() {
		System.out.println("sum method");
	}

}
