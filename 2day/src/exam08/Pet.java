package exam08;

//애완동물의 부모 클래스
public class Pet {
	String name;
	int age;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		//추가 메서드 가능
		//Object에 있는 toString()메서를 재정의한다.
		//재정의하는 이유는 인스턴스변수값을 쉽게 출력하기 위함이다.
	
	}
	
	@Override
	public String toString() {
		return "Pet [name="+name+", age="+age+"]";
	}
	
	public String getPet() {
		return name+"\t"+age;
	}
	
	
	
}

