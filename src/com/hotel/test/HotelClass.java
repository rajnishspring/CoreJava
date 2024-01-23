package com.hotel.test;


import java.util.ArrayList;
import java.util.List;

public class HotelClass {

	private int hotelCharge;
	private int hotelRewards;
	private List<Hotel> hotelsList=new ArrayList<Hotel>();
	
	
	
	String s1 = "REGULAR ,18 MAY 2021 (WED)";

	/*
	 * public List<Hotel> calculateCharge(String s[]) {
	 * System.out.println(s.length); if (s[0].startsWith("REGULAR")) { for (int i =
	 * 1; i < s.length; i++) { Hotel hotel=new Hotel(); hotelsList=
	 * setAmountForAllKindOfHotels(s[i],true,hotel); System.err.println(hotelsList);
	 * } }
	 * 
	 * if (s[0].startsWith("REWARDS")) { for (int i = 1; i < s.length; i++) {
	 * 
	 * hotelsList= setAmountForAllKindOfHotels(s[i],false);
	 * System.err.println(hotelsList); } }
	 * 
	 * 
	 * return hotelsList;
	 * 
	 * }
	 */

	private boolean weekendValidation(String s) {

		String days = s.substring(s.length() - 4, s.length() - 1);
		if (days.equalsIgnoreCase("Sat") || days.equalsIgnoreCase("SUN")) {
			return true;
		} else
			return false;

	}
}
