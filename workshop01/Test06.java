public class Test06 {

    public static void main(String[] args) {
        int i=5;
        String result = "선언 변수 "+i+" 일때 결과:\n"+"숫자는 "+i+(i%2==1?"홀수":"짝수")+"입니다";
        System.out.println(result);
    }
}
