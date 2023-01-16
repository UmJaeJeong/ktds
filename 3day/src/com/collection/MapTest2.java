package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		//고양이 2마리 관리: 야옹이 2 암컷, 망치 1 수컷
		Map<Integer,Cat> map = new HashMap<>();
		map.put(1, new Cat("야옹이",2,"암컷"));
		map.put(2, new Cat("망치",1,"수컷"));

		//Map 저장후에 모든 고양이 출력하시오. key는 정수로 하시오.
		for(Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
