package com.collection;

public class StringTest {

	public static void main(String[] args) {
		//String 클래스
		
		//1.리터럴 이용
		String s = "hello";
		String s2 = "hello";

		//2. new 이용
		String x = new String("hello");
		String x2 = new String("hello");
		
		System.out.println(s);
		System.out.println(x);

		System.out.println(s==s2); //동일만 문자열이기에 주소값이 같다.  true
		System.out.println(x==x2); //동일한 값이지만 new로 생성하기 때문에 주소값이 다르다.  false

		//실제값 비교
		System.out.println(s.equals(s2)); //true
		System.out.println(x.equals(x2)); //true
		System.out.println(x.equals(s)); //true
	}

}
