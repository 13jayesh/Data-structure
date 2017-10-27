/********************************************************************************
	 * Purpose: It Prints days of perticular Month
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
*********************************************************************************/
		package com.bridgelabz.utility;

import com.bridgelabz.util.utility;

public class Calender {

		
		
		
		public static void main(String args[]){
			int day = Integer.parseInt(args[0]);
			int month = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);

			utility.DAYOFWEEK(day,month,year);
			System.out.print("\nCalender for");
			displayCalender(month,year);
						

		}
		 public static void DAYOFWEEK(int day, int month, int year)
			{
	
			int y0 = year - (14 - month) / 12;
			int x = y0 + y0/4 - y0/100 + y0/400;
			int m0 = month + 12 * ((14 - month) / 12) -2;
			int d0 = (day + x + ((31 * m0) / 12)) % 7;

			switch (d0){
				case 0: System.out.println("SUNDAY");
                 break;
				case 1: System.out.println("Monday");
                 break;
				case 2: System.out.println("TUESDAY");
                 break;
				case 3: System.out.println("WEDNESDAY");
                 break;
				case 4: System.out.println("THURSDAY");
                 break;
				case 5: System.out.println("FRIDAY");
                 break;
				case 7: System.out.println("SATURDAY");
                 break;
     }
     }
		static int day,year,month;
		static String dayName;
		static int x,y1,m1,d1;
		
		/* this method takes day month and year from user and calculates which day falls of
		 * the week Returns 0 for Sunday, 1 for Monday, and so on */
		public static int day(int day,int month,int year){
			y1=year-(14-month)/12;
			x=y1+y1/4-y1/100+y1/400;
			m1=month+12*((14-month)/12)-2;
			d1=(day+x+(31*m1)/12)%7;
			return d1;
		}
		
		/* this method returns true if the given year is a leap year */
		public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
	        return false;
	    }
			
		/* this method will find day of month*/
		public static String dayOfWeek1(int day,int month,int year){
			d1=day(day,month,year);
			switch(d1){
				case 0:dayName="Day of the week is Sunday ";
				break;
				case 1:dayName="Day of the week is Monday " ;
				break;
				case 2:dayName="Day of the week is Tuesday " ;
				break;
				case 3:dayName="Day of the week is Wednesday" ;
				break;
				case 4:dayName="Day of the week is Thursday " ;
				break;
				case 5:dayName="Day of the week is Friday " ;
				break;
				case 6:dayName="Day of the week is Saturday " ;
				break;
			}	
			return dayName;
		}
		
	

		public static void displayCalender(int month,int year)
		{
		
			String[] months = {"", "January", "February", "March","April", "May", "June",
								"July", "August", "September","October", "November", "December"};
	
			int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			//29 days in feb month if year is leap year
			if (month == 2 && isLeapYear(year)) 
				days[month] = 29;
			
			System.out.println(" " + months[month] + " " + year+"\n");
	        System.out.println(" S\tM\tTu\tW\tTh\tF\tS");
			int startingDay = day(1, month, year);
			for (int i = 0; i < startingDay; i++)
			{
	            System.out.print("\t");
			}
			for (int i = 1; i <= days[month]; i++) {
	            System.out.print(i+"\t");
	            if (((i + startingDay) % 7 == 0) || (i == days[month])) 
				System.out.println();
	        }
		
		}
		// TODO Auto-generated method stub

	}


