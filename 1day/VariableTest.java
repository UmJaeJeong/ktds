
public class VariableTest {

	public static void main(String[] args) {
		//변수 사용
		//1. 변수선언
		int age;
		String name;
		float height;
		boolean isMarried;
		
		//2. 변수 초기화
		age = 30;
		name = "홍길동";
		height = 180.3f;// f를 사용하지 않으면 double로 인식하여 Err발생
						//f를 붙이지 않으면 8byte이 double로 인식을하여 문제가 발생한것
		isMarried = true;
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(isMarried);
		
		//한꺼번에
		//int age = 30; //변수명이 중복되어서 Err 발생 (식별이 안됨) 

	}

}
