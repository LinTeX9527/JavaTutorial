package ch15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class DateDemo {

	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date();
		
		// display time and date using toString()
		System.out.println(date.toString());
		
		test_format();
		test_format2();
		test_sleep();
		difftime();
	}
	
	// 测量时间差
	private static void difftime() {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			
			Thread.sleep(10 * 1000);
			
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			
			long diff = end - start;
			System.out.println("时间差是" + diff);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void test_sleep() {
		try {
			System.out.println(new Date());
			Thread.sleep(1 * 1000);
			System.out.println(new Date());
		} catch (Exception e) {
			System.out.println("出错了");
		}
	}
	
	private static void test_format2() {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String input = "1818-11-11";
		System.out.println(input + " parses as");
		Date tDate;
		try {
			tDate = ft.parse(input);
			System.out.println(tDate);
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println("Unparseable using " + ft);
		}
	}
	
	private static void test_format() {
		Date dNow = new Date();
		// 格式化时间
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println("当前时间" +  ft.format(dNow));
		
		// 另外一种格式化时间的方法
		String str01 = String.format("当前时间： %tc", dNow);
		System.out.println(str01);
	}

}
