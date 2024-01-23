package org.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelPackageTest {

	public static void main(String[] args) {
		String s="ram sh(yam)";
		System.out.println(s.substring(s.length()-4,s.length()-1));
		String s1="REWARDS ,18 MAY 2021 (WED),19 MAY 2021 (THU),21 MAY 2021 (SAT)";

	String arr[]=s1.split(",");
	HotelUtil util=new HotelUtil();
	List<Hotel> hotel=util.calculateCharge(arr);
	System.out.println(util.calculateCharge(arr));
    Map<String,Integer> map1   =hotel.stream().collect(Collectors.groupingBy(Hotel::getName,Collectors.summingInt(Hotel::getTotalCharge)));
    System.err.println(map1);

	}

}
