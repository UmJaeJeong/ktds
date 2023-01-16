package com.pet;

public class Dog extends Pet {

	String color;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String color) {
		this.color = color;
	}

	public Dog(String name, int age, String color) {
		this.name = name;
		this.age  = age;
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
