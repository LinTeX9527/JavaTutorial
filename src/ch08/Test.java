package ch08;

/**
 * Java 中的位运算
 * */
public class Test {

	public static void main(String[] args) {
		int a = 60; // 60 = 0011 1100
		int b = 13; // 13 = 0000 1101
		int c = 0;
		
		c = a & b; // 12 = 0000 1100
		System.out.println("a & b = " + c);
		
		c = a | b; // 61 = 0011  1101
		System.out.println("a | b = " + c);
		
		c = a ^ b; // 49 = 0011 0001
		System.out.println("a ^ b = " + c);
		
		c = ~a;    // -61 = 1100 0011
		System.out.println("~a = " + c);
		
		c = a << 2; // 240 = 1111 0000
		System.out.println("a << 2 = " + c);
		
		c = a >> 2; // 15 =  1111
		System.out.println("a >> 2 = " + c);
		
		c = a >>> 2; // 15 = 0000 1111
		System.out.println("a >>> 2 = " + c);
		
		String name = "James";
		boolean ans = name instanceof String;
		System.out.println("ans = " + ans);
		
		
		Integer x = 15;
		System.out.println(x);
		System.out.println(x.floatValue());
		System.out.println(x.compareTo(13));
		System.out.println(x.compareTo(15));
		System.out.println(x.compareTo(23));
		
		
		System.out.println(Math.abs(Double.valueOf(-8.3)));
		System.out.println(Math.abs(Float.valueOf("-7.3")));
		
		System.out.println(Math.ceil(Double.valueOf(3.7)));
		System.out.println(Math.ceil(Double.valueOf(3.2)));
		System.out.println(Math.floor(Double.valueOf(3.7)));
		System.out.println(Math.floor(Double.valueOf(-3.7)));
		
		System.out.println(Math.rint(Double.valueOf(3.489)));
		System.out.println(Math.rint(Double.valueOf(3.589)));
		
		
		double x1 = 11.635;
		double y1 = 2.76;
		System.out.printf("e = %.4f\n", Math.E);
		System.out.printf("exp(%.3f) = %.3f\n", x1, Math.exp(x1));
		
		System.out.printf("log(%.3f) = %.3f\n", x1, Math.log(x1));
		
		System.out.printf("pow(%.3f, %.3f) = %.3f\n", x1, y1, Math.pow(x1, y1));
		
		System.out.printf("sqrt(%.3f) = %.3f\n", x1, Math.sqrt(x1));
		
		// 随机数
		System.out.println("随机数：" + Math.random());
		System.out.println("随机数：" + Math.random());
		
	}
}
