import java.util.Scanner;

public class Test09 {

    public static void main(String[] args) {
        //Scanner 이용하여 값을 입력 받는 코드 구현
        Scanner sc = new Scanner(System.in);

        System.out.println("1.정수 입력하세요.");
        int x = sc.nextInt();
        System.out.println("2.정수 입력하세요.");
        int y = sc.nextInt();

        System.out.println("정수 "+x+"과 정수 "+y+"중에서 최대값:"+(x>=y?x:y));
    }
}
