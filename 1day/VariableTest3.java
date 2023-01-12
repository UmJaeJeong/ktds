
public class VariableTest3 {
	//메서드 밖	--> 인스턴스변수, Heap 메모리에 생성
	int num;
	
	//메서드 밖	--> static 포함하면  static 변수, Method Area 메모리
	static int sum;
	
	//main 메서드
	public static void main(String[] args) {
		//메서드 안  --> 로컬변수, Stack 메모리에 저장됨
		int age = 10;
//		float height;
		
		System.out.println(age);
		//System.out.println(height); //초기화가 안되서 출력할때 Err 빌셍 / 초기화 필수
		
		//System.out.println(num);	// static으로 변수를 선언하지 않아서 Err발생
		
		//객체를 생성하여 사용할 수 있음
		VariableTest3 s = new VariableTest3();
		System.out.println(s.num);
		
	}

}
