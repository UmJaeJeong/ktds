
public class ForTest {

	public static void main(String[] args) {

		// 2. qksqhrans
		/*
		 * 구성요소
		 * 	-시작값
		 * 	-조건식
		 * 	-증감식
		 */
		
		for(int n=1; n<=5; n++) {
			System.out.println("hello"+n);	// + 용도는 연결연산자
		}//end for
		
		//다양한 형태
		for(int n=10; n>5; n--) {
			System.out.println("world" + n);// + 용도는 연결 연산자
		}//end for
		
		for(int n=10; n>0; n-=2) {
			System.out.println("Happy" + n);// + 용도는 연결 연산자
		}//end for
		
		for(int n=1, m=1; n<5 && m<6; n++,m++) {
			System.out.println("Ktds" + n);// + 용도는 연결 연산자
		}//end for
		
		
		//중첩
		for(int i=0; i<3; i++) {
			for(int j=0; j<2;j++) {
				System.out.println(i+" "+j);
			}
		}
	}//end main

}//end class
