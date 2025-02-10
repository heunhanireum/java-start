package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " +add(1.2, 1.5));
    }

/*  //얘를 삭제하면 6번째 줄은 밑에 있는 메서드 실행 -> 먼저 본인 타입에 맞는거 실행, 없으면 형 변환 가능한 타입 찾아서 실행
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a+b;
    }
*/

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a+b;
    }
}
