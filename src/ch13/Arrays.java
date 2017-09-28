package ch13;

import sun.tools.jar.resources.jar;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
		array_method_test();
		
	}
	
	private static void array_method_test() {
		
		// Arrays.equals() 比较数组是否相等，首先数组长度必须一样，其次对应索引的数值必须相等
		int[] a = new int[] {3, 2, 1};
		int[] b = new int[] {1, 2, 3};
		int[] c = new int[] {3, 2, 1};
		System.out.println("是否相等:" + java.util.Arrays.equals(a, b)); // false
		System.out.println("是否相等:" + java.util.Arrays.equals(a, c)); // true
		
		
	}
	
	private static void test01() {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		for (int i = 0; i < myList.length; i ++){
			System.out.println(myList[i] + " ");
		}
		
		double total = 0;
		for (int i = 0; i < myList.length; i ++){
			total += myList[i];
		}
		
		System.out.println("Total is: " + total);
		
		// finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i ++){
			if (myList[i] > max) max = myList[i];
		}
		
		System.out.println("Max is:" + max);

		// 使用 for each 的方式遍历数组中每一个元素
		for (double element: myList){
			System.out.println(element);
		}
		
		printArray(new int[]{3, 1, 2, 6, 4, 2});
		
		
		System.out.println("数组逆向的结果：");
		int[] aList = new int[]{1, 2, 3, 4, 5, 6};
		printArray(reverse(aList));
	} // test01
	
	/*
	 * 可以把数组作为参数传给函数
	 * */
	private static void printArray(int[] myarray) {
		for (int i = 0; i < myarray.length; i ++){
			System.out.println(myarray[i] + " ");
		}
	}
	
	
	/**
	 * 不但数组可以作为参数传递给函数，也可以作为返回值
	 * */
	private static int[] reverse(int[] mylist) {
		int[] result = new int[mylist.length];
		
		for (int i = 0, j = result.length-1; i < mylist.length; i++, j--){
			result[j] = mylist[i];
		}
		return result;
	}

}
