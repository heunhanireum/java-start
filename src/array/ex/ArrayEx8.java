package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students;
        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요:");
        int num = scanner.nextInt();
        students = new int[num][3];

        for (int row = 0; row < students.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < 3; column++) {
                System.out.print(subjects[column] + " 점수:");
                students[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < students.length; row++) {
            int sum = 0;
            double average;

            for (int column = 0; column < 3; column++) {
                sum += students[row][column];
            }
            average = (double) sum/3;

            System.out.println((row+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
