package exam07;

//자식(Child)
//Cat is a Pet 성립: 상속관계 가능
//Java는 단일 상속만 가능하다
public class Cat extends Pet{
	
	//Cat에만 있는 속성
	String sex;
	

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}


	/*
	 * public Cat(String name,int age,String sex) { 
	 * super(name,age); //super 클래스를 사용해서 초기값을 넣어주는것이 가독성과 의미가 뚜렷함  
	 * this.name = name; 
	 * this.age = age;
	 * this.sex = sex; }
	 */


	//Cat에만 있는 동작
	public void sleep() {}


	@Override
	public String getPet() {
		return super.getPet();
	}
	
	
	//Cat에서 부모인 Pet의 getPet() 메서드를 수정해야한다.
	//부모의 머서드를 자식이 필요에 의해서 수정된 메서드: 오버라이딩 메서드라 불린다
	/*
	 * overloading method: 
	 *   - 상속 무관
	 *   - 하나의 클래스내에서 동일한 이름의 메서드가 여러개 사용 가능.
	 *   - argument list가 달라야 된다. (갯수, 타입, 순서)
	 *   - 리턴타입만 다르다고 성립하지 않는다. public void a(){} / public int a(){}  2가지를 동시에 사용할 수 없다.
	 *     예) public void a(){}
	 *     	   public void a(int x){}
	 *         pubclid void a(int x, int y){}
	 *         ...
	 *         
	 * overriding method:
	 *   - 상속 전제
	 *   - 부모의 메서드를 자식이 필요에 의해서 수정된 메서드
	 *   - 반드시 부모메서드 이름, 리턴타입, argument list가 같아야 된다.
	 *   - 접근지정자는 같거나 확대 사용 가능 (축소 불가 O)
	 */
	
	//어너테이션 @override를 명시해주는것이 좋다 (관례)
//	@Override
//	public String getPet() {
//		return name+"\t"+age+"\t"+sex;
//	}
	
}
