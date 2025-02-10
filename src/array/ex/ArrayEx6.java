package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int[] numbers;
        int minNum, maxNum;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = scanner.nextInt();

        numbers = new int[cnt];

        System.out.println(cnt + "개의 정수를 입력하세요:");
        for (int i = 0; i < cnt; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = numbers[0];
        maxNum = numbers[0];

        for (int number : numbers) {
            if (number < minNum) {
                minNum = number;
            }
            if (number > maxNum) {
                maxNum = number;
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}
