package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a+b;
        System.out.println("a+b = "+sum); //출력 a+b = 7

        // 뺄셈
        int diff = a-b;
        System.out.println("a-b = "+diff);

        // 곱셈
        int multi = a*b;
        System.out.println("a*b = "+multi);

        // 나눗셈
        int div = a/b;
        // 5나누기2는 2.5이지만 int형끼리 나누면 int형으로 되어서
        // 소수점이 표현이 되지 않음
        System.out.println("a/b = "+div);

        // 나머지
        int mod = a%b;
        System.out.println("a%b = "+mod);
    }
}
