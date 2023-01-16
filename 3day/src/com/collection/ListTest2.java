package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// 고양이 2마리 관리: 야옹이 2 암컷, 망치 1 수켯
		Cat c1 = new Cat("야옹이", 2, "암컷");
		Cat c2 = new Cat("망치", 1, "수컷");

		List<Cat> list = new ArrayList<Cat>();
		list.add(c1);
		list.add(new Cat("야옹이", 2, "암컷"));
		list.add(new Cat("망치", 1, "수컷"));

		// 1.모든 정보 출력하시오.
		for (Cat cat : list) {
			System.out.println(cat);
		}

		// 2.고양이 나이의 합 출력하시오.
		int sum=0;
		for (Cat cat : list) {
			sum+=cat.getAge();
		}
		
		System.out.println(sum);
	}

}

