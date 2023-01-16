package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//순서있고 중복이 가능
		
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동1");
		list.add("홍길동3");
		
		/*
		 * remove(int index): 위치값으로 삭제
		 * remove(Object obj): 값으로 삭제
		 */

		//삽입
		list.add(0, "이순신");//0번쨰 위치에 이순신 삽입
		
		//수정
		list.set(1, "유관순"); //1번째 위치에 유관순으로 변경
		
		//삭제
		list.remove(0); //0번째 위치값 삭제
		list.remove("홍길동3"); //"홍길동3" 값 삭제
		 					// 동일한 값이 있다면 순서가 우선인것이 삭제가 된다. 
//		list.remove(new Integer(5));//값으로 삭제
		
		
		//값 출력방법1
		System.out.println(list);//순서가 있으며 중복이 되는것을 보여줌
		
		//값 출력방법2 - 첨자(index)  사용 가능
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//값 출력방법3 - 향상된 for문
		for(String s : list) {
			System.out.println(s);
		}
		
		//값 출력방법4
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
