package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num = scanner.nextInt();

        String evenOdd;

        if (num%2 == 1) {
            evenOdd = "홀수";
        } else {
            evenOdd = "짝수";
        }

        System.out.println("입력한 숫자 " + num + "는 " + evenOdd + "입니다.");
    }
}
