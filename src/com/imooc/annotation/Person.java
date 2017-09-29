package com.imooc.annotation;

/**
 * 学习Java 注解 annotation
 * 参见 
 * http://www.imooc.com/learn/456
 * 
 * @author LinTeX9527
 *
 */
public interface Person {

	public String getName();
	
	public int getAge();
	
	/**
	 * '@Deprecated' 表示方法过时了，不应该继续使用
	 */
	@Deprecated
	public void sing();
}
