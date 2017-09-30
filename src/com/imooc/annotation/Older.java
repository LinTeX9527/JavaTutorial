package com.imooc.annotation;

public class Older implements Person {
	
	private String name;
	private int age;
	
	
	public Older(String name, int age) {
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
		System.out.println("older sing a song with great effort.");
	}

}
