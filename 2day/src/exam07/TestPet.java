package exam07;

public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat("망치",2,"암컷"); //Pet이 먼저 생성된 후 Cat이 생성되므로 출력문으로 확인 가능하다.
		System.out.println(c.getPet());

	}

}
