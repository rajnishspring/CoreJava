package com.example.demo;

import java.util.Optional;
public class OptionalClass {
public static void main(String[] args) {
	Optional<Object> optional=Optional.empty();
	System.out.println(optional );
	optional.get();
	String s="null";
	Optional<String> o=Optional.ofNullable(null);
	//String ss=o.get();
 //   System.out.println(ss);
    String s1="sample null";
    Optional<String> o1=Optional.ofNullable(s1);
    o1.orElse("default");
    //String ss1=o1.get();
    System.out.println(o1.orElse("default"));
}
}
