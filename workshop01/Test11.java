import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {
        //Scanner 이용하여 값을 입력 받는 코드 구현
        Scanner sc = new Scanner(System.in);
        System.out.println("주소를 입력하세요.");

        String adress = sc.nextLine();
        String[] sp = adress.split(" ");
        System.out.println("문자 갯수(공백포함):" + adress.length());
        System.out.println("단어 갯수:" + sp.length);

    }
}
