package com.collection;

//분석단계 고양이 객체에서
public class Cat {

	
	//인스턴스 변수(멤버 변수) Heap에 저장됨
	String name;
	int age;
	String sex;
	
	//오버로딩 생성자 : 하나의 클래스내에 동일한 이름의 생성자가 여러개 지정가능
	//단, argument list가 달라야 한다.
	//생성자
	public Cat() {//기본생성자는 만들지 않아도 디폴드 값이다.
	}
	//
	//{}를 가진 worker 쪽의 변수를 파라미터(parameter)라고 부름
	public Cat(String name) {//매개변수들 Stack에 저장됨 
		this.name = name;

	}
	
	public Cat(String name, int age) {//매개변수들 Stack에 저장됨 
		this.name = name;
		this.age = age;

	
	}
	
	public Cat(String name, int age,String sex) {//매개변수들 Stack에 저장됨 
		this.name = name;
		this.age = age;
		this.sex = sex;

	}

	//메서드(인스턴스 메서드, 멤버 메서드)
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
	
	
}
