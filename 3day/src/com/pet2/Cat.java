package com.pet2;

public class Cat extends Pet {
	
	String sex;
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	public Cat() {

	}

	public Cat(String sex) {
		super();
		this.sex = sex;
	}

	public Cat(String name, int age, String sex) {
		this.sex = sex;
		this.age = age;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Cat [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	
	



	
	

}
