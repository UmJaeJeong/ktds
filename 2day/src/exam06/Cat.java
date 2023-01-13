package exam06;

//자식(Child)
//Cat is a Pet 성립: 상속관계 가능
//Java는 단일 상속만 가능하다
public class Cat extends Pet{
	
	//Cat에만 있는 속성
	String sex;
	
	public Cat() {
		//자식 클래스 생성자 첫라인에서 자동으로 부모 생성자가 호출된다.
		//super();//명시적 호출 반드시 첫라인에서 사용
		System.out.println("Cat 생성자");
	}
	
	//Cat에만 있는 동작
	public void sleep() {}

}
