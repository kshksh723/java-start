package array;
/*
배열 리펙토링 - 변수 값 사용

// 변수 값 사용
 System.out.println("학생 1 점수 : " + students[0]);
 System.out.println("학생 2 점수 : " + students[1]);
 System.out.println("학생 3 점수 : " + students[2]);
 System.out.println("학생 4 점수 : " + students[3]);
 System.out.println("학생 5 점수 : " + students[4]);

 --> 변수 명이 students로 같기 때문에 숫자가 반복되는 부분만 해결하면 반복문을 도입할 수 있을 것 같다. for문을 사용해서 문제를 해결해보자


 참고 : 리펙토링
 리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과정을 뜻한다
 이는 중복을 제거하고, 복잡성을 줄이며, 이해하기 쉬운 코드로 만들기 위해 수행된다.
 리펙토링은 버그를 줄이고, 프로그램의 성능을 향상 시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다
 쉽게 이야기해서 작동하는 기능은 똑같은데, 코드를 개선하는 것을 리펙토링이라 한다
 */
public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
        System.out.println("학생1 점수 : " + students[0]);
        System.out.println("학생2 점수 : " + students[1]);
        System.out.println("학생3 점수 : " + students[2]);
        System.out.println("학생4 점수 : " + students[3]);
        System.out.println("학생5 점수 : " + students[4]);
    }
}
/*
length => 배열의 길이를 반환
배열 할 때 for문 사용하는 게 좋음


-- 반복문을 사용해서 배열을 통해 값을 사용하는 부분을 효과적으로 변경했다
-- 배열의 인덱스는 0부터 시작하기 때문에 반복문에서 i = 0을 초기값으로 사용했다
-- students.length
       == 배열의 길이를 제공하는 특별한 기능이다
       == 참고로 이 값은 조회만 할 수 있다 대입은 할 수는 없다
       == 현재 배열의 크기가 5이기 때문에 여기서는 5가 출력된다
-- for문의 조건이 i < students.length이기 때문에 i는 0,1,2,3,4까지만 반복한다
       == i가 5가 되면 5 < 5가 되면서 조건이 거짓이 되고 반복을 종료한다

 */