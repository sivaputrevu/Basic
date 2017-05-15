package org.siva.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class FindLuckyDates{
	public void findLuckyDates(){
		String date1 = "01/01/0001";
		String date2 = "01/02/2003";
		try{
			Date sdf1 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
			Date sdf2 = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
			//System.out.println((sdf2.getTime()-sdf1.getTime())/(1000*60*60*24));
			int day = sdf1.getDay();
			int day2 = sdf1.getDay();
			
			Calendar c = Calendar.getInstance();
			c.setTime(sdf1);
			c.add(Calendar.DATE, -1);
			System.out.println(c.getTime());
		}//try
		catch(Exception e){
			e.printStackTrace();
		}//catch
		
	}
}
public class LuckyDates {

	public static void main(String[] args) {
		FindLuckyDates find = new FindLuckyDates();
		find.findLuckyDates();
	}

}
