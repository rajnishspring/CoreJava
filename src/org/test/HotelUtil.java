package org.test;

import java.util.ArrayList;
import java.util.List;

public class HotelUtil {

	private int hotelCharge;
	private int hotelRewards;
	private List<Hotel> hotelsList=new ArrayList<Hotel>();
	String hotelArr []= {"radission","taj","oyo"};

	String s1 = "REGULAR ,18 MAY 2021 (WED)";

	public List<Hotel> calculateCharge(String s[]) {
		System.out.println(s.length);
		if (s[0].startsWith("REGULAR")) {
			for (int i = 1; i < s.length; i++) {
			
				hotelsList=	 setAmountForAllKindOfHotels(s[i],true);
				System.err.println(hotelsList);
			}
		}
		
		if (s[0].startsWith("REWARDS")) {
			for (int i = 1; i < s.length; i++) {
				
				hotelsList=	 setAmountForAllKindOfHotels(s[i],false);
				System.err.println(hotelsList);
			}
		}
		

		return hotelsList;

	}

	private boolean weekendValidation(String s) {

		String days = s.substring(s.length() - 4, s.length() - 1);
		if (days.equalsIgnoreCase("Sat") || days.equalsIgnoreCase("SUN")) {
			return true;
		} else
			return false;

	}
	//18 MAY 2021 (WED)
	private List<Hotel> setAmountForAllKindOfHotels(String s,boolean flag)
	{
		if(flag) {
		for(int i=0;i< hotelArr.length;i++)
		{
			Hotel hotel=new Hotel();
			hotel.setName(hotelArr [i]);
		if(i==0)
		{
		if (weekendValidation(s)) {
			
			hotelCharge=hotelCharge+100;

		} else {
			hotelCharge=hotelCharge+110;

		}
		hotel.setTotalCharge(hotelCharge);
		}
		if(i==1)
		{
			if (weekendValidation(s)) {
				
				hotelCharge=hotelCharge+110;
				
			} else {
				hotelCharge=hotelCharge+120;
				
			}
			hotel.setTotalCharge(hotelCharge);
		}
		if(i==2)
		{
			if (weekendValidation(s)) {
				
				hotelCharge=hotelCharge+90;
				
			} else {
				hotelCharge=hotelCharge+130;
				
			}
			hotel.setTotalCharge(hotelCharge);
		}
		hotelsList.add(hotel);
		hotelCharge=0;
		
	}
	return hotelsList;
		}
		else
		{
			
				for (int i = 0; i < hotelArr.length; i++) {
					Hotel hotel = new Hotel();
					hotel.setName(hotelArr[i]);
					if (i == 0) {
						if (weekendValidation(s)) {

							hotelCharge = hotelCharge + 90;

						} else {
							hotelCharge = hotelCharge + 100;

						}
						hotel.setTotalCharge(hotelCharge);
					}
					if (i == 1) {
						if (weekendValidation(s)) {

							hotelCharge = hotelCharge + 95;

						} else {
							hotelCharge = hotelCharge + 105;

						}
						hotel.setTotalCharge(hotelCharge);
					}
					if (i == 2) {
						if (weekendValidation(s)) {

							hotelCharge = hotelCharge + 90;

						} else {
							hotelCharge = hotelCharge + 130;

						}
						hotel.setTotalCharge(hotelCharge);
					}
					hotel.setType("Rewards");
					hotelsList.add(hotel);
					hotelCharge=0;

				}
				return hotelsList;
			
			
			
		}
	}

}
