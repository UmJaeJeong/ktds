import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        //Scanner 이용하여 값을 입력 받는 코드 구현
        Scanner sc = new Scanner(System.in);
        System.out.println("주소를 입력하세요.");

        String adress = sc.nextLine();
        String[] sp = adress.split(" ");
        System.out.println("도명: "+sp[0]);
        System.out.println("시명: "+sp[1]);
        System.out.println("구명: "+sp[2]);
    }
}
