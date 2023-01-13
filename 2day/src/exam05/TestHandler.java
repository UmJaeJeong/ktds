package exam05;

public class TestHandler {

	public static void main(String[] args) {
		//static은 인스턴스 전에 사용 가능하다 즉, new하기 전에 가능
		Test.b();
		Test.num=20;
		
		//인스턴스접근은 반드시 객체생성 이후에 
		Test t = new Test();
		
		t.a();
		t.size = 10;

	}

}
