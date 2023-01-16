package com.pet;

public class TestPet4 {

	// 메서드 다형성을 적용시켜 Cat, Dog, Pet 모두 받을수있다.
	public static void method(Pet pet) {
		
	}
	
	//Object가 파라메터로 나온다면 모든 클래스를 받을수 있다(다형성이 적용)
	//public static void method(Object o){}

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Pet p = new Pet();

		method(c);
		method(d);
		method(p);
	}
}
