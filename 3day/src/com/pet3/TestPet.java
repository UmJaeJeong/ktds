package com.pet3;

public class TestPet {

	public static void main(String[] args) {

		//Flyer f = new Flyer(); //인터페이스 생성 불가능
		
		//다형성 적용
		Flyer f = new Bird();
		f = new Bug();

	}
}
