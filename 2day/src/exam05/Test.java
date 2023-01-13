package exam05;

public class Test {
	static int num;
	int size;
	
	public void a() {
		System.out.println(num);
		System.out.println(size);
		System.out.println(this);
	}
	
	public static void b() {
		System.out.println(num);
//		System.out.println(size);// size는 인스턴스 변수이기 떄문에 접근 불가
//		System.out.println(this);//this도 사용 불가능 왜냐하면 static이므로 b()가 먼저 생성됨
	}
}
