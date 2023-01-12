
public class Break_ContinueTest {

	public static void main(String[] args) {

		// break : 가장 가까운 반복문을 빠져 나올때 사용
		for (int n = 1; n <= 5; n++) {
			if (n == 3)
				break;
			System.out.println("hello" + n); // + 용도는 연결연산자
		} // end for

		// continue : 반복되는 문장들중에서 임의의 문장을 skip할때
		for (int n = 1; n <= 5; n++) {
			System.out.println(n+"회 : 100");
			if(n==2)continue;
			System.out.println(n+"회 : 200");
			System.out.println(n+"회 : 300");
		}

		System.out.println("end");

	}

}
