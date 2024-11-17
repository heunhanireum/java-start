package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        } //첫번째 if문을 통해서 7살보다 큰 걸 알고 있는데 age >= 8 여부를 또 체크하고 있음(중복체크하고 있음)
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14&& age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
