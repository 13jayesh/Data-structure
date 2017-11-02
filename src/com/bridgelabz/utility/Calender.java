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
		 