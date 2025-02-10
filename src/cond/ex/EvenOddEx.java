package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int num = 3;
        String result = (num%2 != 0) ? "홀수" : "짝수";

        System.out.println("num = " + num + ", " + result + "입니다.");
    }
}
