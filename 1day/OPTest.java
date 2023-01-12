
public class OPTest {

	public static void main(String[] args) {
		// 1. 산술연산자
		int n = 10;
		int n2 = 3;
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		System.out.println(n/n2);
		System.out.println(n%n2);
		
		//2.비교연산자
		System.out.println(n>n2);
		System.out.println(n>=n2);
		System.out.println(n<n2);
		System.out.println(n<=n2);
		System.out.println(n==n2); // 같냐? 기본형 : == 연산자 이용, 참조형 : equals() 메서드 사용
		System.out.println(n!=n2);

		//3. 대입연산자 ==> 값을 대입 (그냥대입, 더해서대입, 빼서대입, 곱해서대입, 나누어서대입 ...)
		int x = 10;
		int x2 = 20;
		
		//문제: x와 x2를 더해서 다시 x에 저장
		x+=x2;// x = x + x2; 동일
		x-=x2;// x = x - x2; 동일
		x*=x2;// x = x * x2; 동일
		x/=x2;// x = x / x2; 동일
		x%=x2;// x = x % x2; 동일
		System.out.println(x);
		
		//4. 증감연산자 ==> 값을 1 증가(증가 연산자), 값을 1감소(감소 연산자)
		
		int k= 10;
		//문제: k에 1을 더해서 다시 k에 저장하시오
		k++;// 후치 연산자 
		++k;// 전치 연산자 
		k+=1;
		k = k+1;
		System.out.println(k);
		
		//문제2 : z에서 1을 더해서 저장하시오.
		int z = 10;
//		int result = ++z; //전치 : 먼저 증가하고 나중에 할당  / 값 : 11
		int result = z++; //후치 : 먼저 할당하고 나중에 증가  / 값 : 10
		
		System.out.println(z+" "+result);
		
	}

}
