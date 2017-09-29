package com.imooc.annotation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 因为在接口 Person 中标记方法 sing() 是一个 Deprecated，所以之后在其他地方的使用都会用中画线的提示，
	 * 如果需要忽略这个提示，就需要加上 '@SuppressWarnings("deprecation")'
	 */
	@SuppressWarnings("deprecation")
	public void testann(){
		Person aPerson = new Child();
		aPerson.sing();
	}

}
