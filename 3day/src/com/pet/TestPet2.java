package com.pet;

import java.util.Arrays;

public class TestPet2 {

	public static void main(String[] args) {
		// 다형성 적용 예
		// 1. 배열
		Cat c = new Cat("뇽뇽이", 2, "트젠(남->여)");
		Pet[] p = { c, new Cat("야옹이", 1, "암컷"), new Cat("야옹옹", 2, "암컷"), new Dog("강아지", 6, "블랙"),
				new Dog("뫙취", 2, "블랙앤 화이트")

		};

		// 전체출력
		System.out.println(Arrays.toString(p));

		// 향상된 for문: foreach문
		for (Pet pet : p) {
			if (pet instanceof Dog)
				System.out.println(pet);
		}

		// Dog만 출력하시오
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Dog)
				System.out.println(p[i]);
		}
		for (Pet pet : p) {
			if (pet instanceof Dog)
				System.out.println(pet);
		}

		// Dog의 이름과 색상만 출력하시오.
		for (Pet pet : p) {
			if (pet instanceof Dog) {
				// Dog타입으로 형변환
				Dog dog = (Dog)pet;
				// Pet에는 color가 없으므로 Dog으로 강제캐스팅(형변환) 해야한다.
				System.out.println(pet.getName() + ", " + ((Dog) pet).getColor());
			}

		}

	}
}
