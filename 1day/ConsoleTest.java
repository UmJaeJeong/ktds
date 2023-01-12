

public class ConsoleTest {

	public static void main(String[] args) {
		//콘솔 출력
		//1. println ==> new line(개행)
		System.out.println("Hello");
		System.out.println("Hello2");
		dividingLine();
		
		//2. print ==> new line 안됨
		System.out.println("Hello");
		System.out.println("Hello2");		
		dividingLine();
		
		//3. printf ==> 포맷 지정 사용
		//printf("포맷	",값, 값1, ...)
		System.out.printf("이름:%s 나이:%d 키:%f 성별:%c %b","홍길동",20,183.25632,'남',true);
	}
	
	public static void dividingLine() {
		System.out.println("=======================================");
	}

}
