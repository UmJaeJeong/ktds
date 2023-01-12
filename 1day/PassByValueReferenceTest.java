import java.util.Arrays;

public class PassByValueReferenceTest {

	public static void pdt(int n) {
		System.out.println("pdt : "+n);
		//값 변경
		n=20;
	}

	public static void rdt(int[] n) {
		n[0] = 9999;
		n[1] = 1541;
		n[2] = 343;
	}

	public static void main(String[] args) {
		//기본형 변수
		int num = 10;
		System.out.println("변경전 값");
		pdt(num);
		
		int[] nums = {100,200,300};
		System.out.println("주소값 : " +nums);
		System.out.println("before rdt : "+Arrays.toString(nums));
		rdt(nums);
		System.out.println("after rdt : "+Arrays.toString(nums));

		System.out.println(Arrays.toString(nums));
		
	}

}
