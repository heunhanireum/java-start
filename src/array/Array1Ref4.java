package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

/*
        이렇게 할 때는 선언과 초기화를 나눌 수 없다
        int[] students;
        students = {90, 80, 70, 60, 50}; -> 여기만 보면 students가 int형 배열인지 알 수 없음
*/

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}
