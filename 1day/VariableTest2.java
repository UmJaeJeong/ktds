
public class VariableTest2 {

	public static void main(String[] args) {
		{
			int age = 10; //스코프가 분리되어있어서 사용 가능 
						  //But 중괄호가 사라지면 사용 못함
			System.out.println(age); //출력: 10
		}
		
		int age = 13;
		System.out.println(age);//출력: 13
		
		
		int x;
		if(true) {
			//int x = 10; 
			x = 10;
		}
		System.out.println(x);
		
	}

}
