package ch17;

/**
 * 可变参数的方法
 * 可变参数的定义必须使用 (type... argname)
 * 在方法里面把 argname 看成一个数组就行。
 * */
public class VarargsDemo {

	public static void main(String[] args) {
		printMax(34, 23, 314, 14, 12, 89);
		printMax(new double[]{1, 2, 3});
	}
	
	
	public static void printMax( double... numbers) {
		if (numbers.length == 0){
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for (int i = 1; i < numbers.length; i ++){
			if (numbers[i] > result)
				result = numbers[i];
		}
		
		System.out.println("Max is " + result);
	}

}
