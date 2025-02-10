package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // \n을 읽어서 넘어가짐

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n 중에서 10만 가져감 -> \n이 남음
            input.nextLine(); // \n을 여기서 읽고 버림 -> 11행에서 문제 X

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
