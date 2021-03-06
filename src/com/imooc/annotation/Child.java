package com.imooc.annotation;

public class Child implements Person {

	private String name;
	private int age;
	
	
	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void sing() {
		System.out.println("child sing wonderful.");
	}

	
	@Override
	public String toString() {
		return String.format("name: %s, age: %d.", name, age);
	}
}
