import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {

		//키보드로 입력한 값 얻기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("이름 : "+name);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println(name+"\t"+age);
		
		
		System.out.println("end");
	}

}
