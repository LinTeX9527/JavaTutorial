package ch12;

import java.io.UnsupportedEncodingException;

/**
 * character class
 * 
 * */
public class Test {

	public static void main(String[] args) {
		char unichar = '\u039A';
		System.out.printf("%c", unichar);
		
		// an array of chars
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray[2]);
		
		Character ch1 = 'a';
		System.out.println(ch1);
		
		System.out.println("She said \"Hello!\" to me.");
		
		/* character methods */
		System.out.println(Character.isLetter('a')); // true
		System.out.println(Character.isLetter('5')); // false
		
		System.out.println(Character.isDigit('a')); // false
		System.out.println(Character.isDigit('5')); // true
		
		System.out.println(Character.isWhitespace('c')); // false
		System.out.println(Character.isWhitespace(' ')); // true
		System.out.println(Character.isWhitespace('\n')); // true
		System.out.println(Character.isWhitespace('\t')); // true
		
		
		/* StringBuffer && StringBuilder */
		StringBuffer sBuffer = new StringBuffer("test");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		
		sBuffer.insert(3, 'X');
		System.out.println(sBuffer);
		
		sBuffer.reverse();
		System.out.println(sBuffer);
		
		sBuffer.delete(5, 8);
		System.out.println(sBuffer);
		
		sBuffer.replace(5, 8, "123");
		System.out.println(sBuffer);
		
		sBuffer.append("0123456789987456321032365");
		System.out.println(sBuffer.capacity());
				
		
		// 字符串输出到字符串
		String fs;
		fs = String.format("The value of the float variable is " +
							"%f, while the value of the integer " +
							"variable is %d, and the string " + 
							"is %s", 3.15, 3, "haha");
		System.out.println(fs);
		System.out.println(fs.hashCode());
		
		test_string();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
		test11();
		test12();
		test13();
		test14();
	}
	
	private static void test14() {
		String str01 = new String(" Welcome to Turtorialspoint.com   ");
		System.out.println(str01.trim());
	}
	
	private static void test13(){
		String str01 = new String("Welcome-to-Tutorialspoint.com");
		
		System.out.println("Return value:");
		for (String retval: str01.split("-", 2)){
			System.out.println(retval);
		}
		
		System.out.println("");
		System.out.println("Return value");
		for (String retval: str01.split("-", 3)){
			System.out.println(retval);
		}
		
		System.out.println("");
		System.out.println("Return value:");
		for (String retval: str01.split("-", 0)){
			System.out.println(retval);
		}
		
		System.out.println("");
		System.out.println("Return value:");
		for (String retval: str01.split("-", 5)){
			System.out.println(retval);
		}
		
	}
	
	private static void test12(){
		String fString;
		fString = String.format("float = %f, int = %d, string = %s\n", (double)10.3, 12, "welcome");
		System.out.println(fString);
		
	}
	
	private static void test11() {
		String str = new String("Welcome to Tutorialspoint.com");
		
		System.out.println(str.replace('o', 'T')); // 把 str 中的所有 'o'  替换成 'T'
	}
	
	private static void test10() {
		String str1 = new String("Welcome to Tutorialspoint.com");
		String str2 = new String("Tutorials");
		String str3 = new String("TUTORIALS");
		
		// 从 str1 的序号11 开始，比较 str2 的从0到9的字符， 区分大小写
		System.out.println(str1.regionMatches(11, str2, 0, 9)); // true
		System.out.println(str1.regionMatches(11, str3, 0, 9)); // false
		
		// 从 str1 的序号11开始，比较 str3 的从0到9的字符，忽略大小写=true
		System.out.println(str1.regionMatches(true, 11, str3, 0, 9)); // true
	}
	
	private static void test9() {
		String str1 = new String("Welcome to Tutorialspoint.com");
		
		System.out.println("Return value:");
		System.out.println(str1.matches("(.*)Tutorials(.*)"));
		
		System.out.println("Return value:");
		System.out.println(str1.matches("Tutorials"));
		
		System.out.println(str1.matches("Welcome(.*)"));
		
	}
	
	private static void test8() {
		String str1 = new String("Welcome to Tutorialspoint.com");
		String str2 = new String("WELCOME TO TUTORIALSPOint.COM");
		
		System.out.println("Canonical representation:");
		System.out.println(str1.intern());
		
		System.out.println("Canonical representation:");
		System.out.println(str2.intern());
	}
	
	private static void test7(){
		String str = new String("Welcome to Tutorialspoint.com");
		
		String sub = new String("Tutorials");
		
		System.out.println(str.indexOf(sub));
		System.out.println(str.indexOf(sub, 15));
	}
	
	private static void test6(){
		String str1 = new String("Welcome to Tutorialspoint.com");
		char[] str2 = new char[7];
		
		try {
			str1.getChars(2, 9, str2, 0);
			System.out.println("copied value:");
			System.out.println(str2);
		} catch (Exception e) {
			e.printStackTrace( );
		}
	}
	
	private static void test5(){
		String str1 = new String("Welcome to Tutorialspoint.com");
		
		try {
			byte[] str2 = str1.getBytes("UTF-8");
			System.out.println("Returned value:" + str2);
			
			str2 = str1.getBytes("ISO-8859-1");
			System.out.println("Returned value:" + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	private static void test4(){
		char[] str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		String str2 = "";
		
		str2 = str2.copyValueOf(str1);  // 由一个字符数组得到一个 String 对象
		System.out.println("Returned string: " + str2);
	}
	
	private static void test3(){
		String str1 = "Not immutable";
		String str2 = "Strings are immutable";
		StringBuffer str3 = new StringBuffer("Not immutable");
		
		boolean result = str1.contentEquals(str3);
		System.out.println(result); // true
		
		result = str2.contentEquals(str3);
		System.out.println(result); // false
	}
	
	private static void test2(){
		String s = "Strings are immutable";
		s = s.concat(" all the time");
		System.out.println(s);
	}

	private static void test_string(){
		String str1 = "Strings are immutable";
		String str2 = new String("Strings are immutable");
		String str3 = new String("Integers are not immutable");
		
		int result = str1.compareTo(str2); // equal
		System.out.println(result);
		
		result = str2.compareTo(str3); // str2 is greater then str3
		System.out.println(result);
		
	}
	

}
