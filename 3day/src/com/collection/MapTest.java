package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		//key / value 쌍으로 저장 
		
		Map<String, String> m = new HashMap<>();
		
		m.put("p1","tv");
		m.put("p2","phone");
		m.put("p3","notebook");
		m.put("p3","pc");	//key가 동일하면 덮어쓴다.
		
		//값 출력 : 반드시 key 이용하여 value값을 반환받음
		//1)key 알고 있을때,
		System.out.println(m.get("p1"));
		System.out.println(m.get("p2"));
		System.out.println(m.get("p3"));
		System.out.println(m.get("p5")); //없는 key사용시 null반환

		//2) key값만 따로 얻고 나중에 value 얻는다.
		Set<String> keys = m.keySet();
		System.out.println(keys);
		
		for(String key  : keys) {
			System.out.println(key+"\t"+m.get(key));
		}
		
		
		//삭제
		m.remove("p1");
		System.out.println();
	}

}
