package com.example.demo;

import java.util.function.Supplier;

public class SuppplierLambda {
	public static void main(String[] args) {
		Supplier<SampleDto> supplier=()->{
			SampleDto dto=new SampleDto();
			dto.setId(12);
			dto.setName("this is it");
			return dto;
		};
		System.err.println(	supplier.get());	
	}

}
