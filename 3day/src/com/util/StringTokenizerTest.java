package com.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String mesg = "홍길동/이순신/유관순";
		
		StringTokenizer st = new StringTokenizer(mesg,"/");
		/*
		 * System.out.println(st.nextToken()); System.out.println(st.nextToken());
		 * System.out.println(st.nextToken());
		 */
		
		
//		System.out.println(st.nextToken());// NosuchElement Err발생
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		

	}

}
