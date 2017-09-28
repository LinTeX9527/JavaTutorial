package ch15;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		String months[] = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"
		};
		
		int year;
		// create a gregorian calendar, initialized
		// with the curretn date and time in the 
		// default locale and timezone
		GregorianCalendar gCalendar = new GregorianCalendar();
		// display current time and date information.
		System.out.println("date:");
		System.out.print(months[gCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gCalendar.get(Calendar.YEAR));

		System.out.println("Time: ");
		System.out.print(gCalendar.get(Calendar.HOUR) + ":");
		System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gCalendar.get(Calendar.SECOND));
		
		// test if the current year is a leap year.
		if (gCalendar.isLeapYear(year)){
			System.out.println("The current year is a leap year.");
		} else {
			System.out.println("The current year is not a leap year.");
		}
	}

}
