package com.lambda;


public class TestMain {

	public static void main(String[] args) {

		Flyer f = new Flyer() {

			@Override
			public void fly() {
				System.out.println("fly");
			}
		};

		Flyer f3 = () -> {
			System.out.println("람다 표현");
		};
		f3.fly();
		
		//##########################################################
		 
		Flyer2 k = new Flyer2() {
			
			@Override
			public void fly(int x, String s2) {
				System.out.println("Flyer2 "+x+"\t"+s2);
				
			}
		};
		
		//람다식 표현
		Flyer2 k2 = (x,x2)->{
			System.out.println("welcome "+x2+" 뽱"+x);
		};
		
		k2.fly(10, "hell");
		
		//파라미터, 리턴값 보유 람다
		//2가지 표현식 람다 뒤에 값만 있다 그러면 리턴값이 존재하는 것이다.
		Flyer3 z2 = (x,x2)->{return x+x2;};
		Flyer3 z3 = (x,x2)->x+x2; //위의 방식보다 이방식을 권유함

		
		Flyer3 k3 = new Flyer3() {
			
			@Override
			public int fly(int x, int y) {
				System.out.println(x+y);
				return x+y;
			}
		};
		
		k3.fly(1, 2);
		
		Flyer3 k33 = (x, y) ->{
			System.out.println(x+y);
			return x+y;
		};
		
		k33.fly(1, 7);
		
	}

}
