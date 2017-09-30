package com.imooc.annotation;

public class Test {

	public static void main(String[] args) {
		testann();
	}
	
	/**
	 * 因为在接口 Person 中标记方法 sing() 是一个 Deprecated，所以之后在其他地方的使用都会用中画线的提示，
	 * 如果需要忽略这个提示，就需要加上 '@SuppressWarnings("deprecation")'
	 */
	@SuppressWarnings("deprecation")
	public static void testann(){
		
		Person aPerson = new Child("Xiao Hong", 16);
		aPerson.sing();
		
		Person bPerson = new Older("Shu Fen", 76);
		bPerson.sing();
		
		// 关于  Object 类的基本方法的使用
		if (aPerson.equals(bPerson)){
			System.out.println("a.equals(b) -- true");
		} else {
			System.out.println("a.equals(b) -- false");
		}
		
		
		System.out.println("a.getClass() -- " + aPerson.getClass());
		
		System.out.println("a.hasCode() -- " + aPerson.hashCode());
		
		// 从这个结果可以看出 接口对象可以直接调用子类对象的方法。
		System.out.println("a.toString() -- " + aPerson.toString());
		
		
	}

}
