package com.pet2;

public class TestPet {

	public static void main(String[] args) {

		//추상클래스는 객체생성을 할수 없다. new 불가능
		//Pet p = new Pet();
		
		//추상클래스로 인해 eat() 메서드를 일관적으로 사용할수 있다.
		Pet p = new Cat();
		p.eat();
		p=new Dog();
		p.eat();

	}
}
