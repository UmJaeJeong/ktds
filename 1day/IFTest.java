
public class IFTest {

	public static void main(String[] args) {

		// 1. 조건문
		// 가. 단일 if문
		System.out.println("1");
		if (false) {
			System.out.println("2");
			System.out.println("3");
		}

		System.out.println("end");

		// 나. if~else 문: 조건에 따라서 실행되는 문장이 다를때 사용
		System.out.println("10");

		if (false) {
			System.out.println("20");
		} else {
			System.out.println("30");
		}

		System.out.println("end");

		// 다. 다중 if문 조건이 여러개 지정시 사용
		/*
		 * 90~100: A학점 80~90: B학점 70~80: C학점 .. : F학점
		 */
		int score = 90;

		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");

		} else if (score >= 70) {
			System.out.println("C학점");

		} else {
			System.out.println("F학점");

		}

		// switch문: 다중비교이면서 연산자가 동등인 경우에 사용
		int key = 10;

		switch (key) { // long은 key값에 안된다.
		case 5:
			System.out.println(5);
			break;
		case 10:
			System.out.println(10);

			break;
		case 15:
			System.out.println(15);

			break;
		default:
			System.out.println("모두 만족하지 않을경우 실행");
			break;
		}

		// switch에 지정가능한 타입 : byte(o), short(o), int(o), long(x), String(o), enum(o)

		char key2 = 'A';
		switch (key2) {
		case 'A':
			System.out.println("A점수");
			break;
		case 'B':
			System.out.println("B점수");
			break;
		case 'C':
			System.out.println("C점수");
			break;
		default:
			System.out.println("기타 점수");
			break;
		}
	}

}
