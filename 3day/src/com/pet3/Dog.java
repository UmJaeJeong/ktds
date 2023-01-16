package com.pet3;

public class Dog extends Pet {

	String color;
	
	//함수
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	public Dog() {
	}

	public Dog(String color) {
		this.color = color;
	}

	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

}
