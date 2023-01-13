package exam08;

public class Cat extends Pet{
	
	String sex;
	

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cat(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}

	public void sleep() {
		
	}


	@Override
	public String toString() {
		return "Pet [name="+super.getName()+", age="+super.getAge()+", sex="+sex+"]";
	}

}
