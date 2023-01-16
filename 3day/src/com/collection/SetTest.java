package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		// 순서가 없고 중복이 불가능하다.
		// <>이 제네릭이다.
//		Set s = new Set();//에러남 Set은 인터페이스(Interface)이다.
		Set s = new HashSet(); // 상속으로 인해서 가능하다.

		s.add("홍길동");
		s.add(20);
		s.add("홍길동");

		// 출력방법1
		System.out.println(s); // s.toString() 호출함

		// 출력방법2
		for (Object obj : s) {
			System.out.println(obj);
		}

		// 제네릭스 이용: 저장되는 데이터 타입제한
		Set<String> s2 = new HashSet<String>();
		s2.add("홍길동");
		// s2.add(20);
		s2.add("홍길동");

		Set<Integer> s3 = new HashSet<Integer>();
//		s3.add("홍길동");
		s3.add(20);
//		s3.add("홍길동");
	}

}
