package array;
/*
        배열의 리펙토링 - 간단한 배열 생성
        배열은 {}만 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공한다

        -- 배열의 편리한 초기화--
        int [] students = {90,80,70,60,50};

        단 이때는 예제와 같이 배열 변수의 선언을 한 줄에 함께 사용할 때만 가능하다
        물론 이렇게 하더라도 자바가 내부에서 배열 요소의 크기를 보고 new int[5]을 사용해서 배열을 생성한다. 따라서
        기존 코드를 조금 더 편리하게 사용할 수 있는 편의 기능이라 생각하면 된다

        오류
        int [] students;
        students = {90, 80, 70, 60, 50};


 */
public class ArrayRef4 {
    public static void main(String[] args) {
        // 배열의 생성 간략 버전, 배열 선언과 함께 사용 시 new int[] 생략 가능
        int[]  students = {90, 80, 70, 60, 50};

        
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
/*
이제 학생의 점수를 추가해도 {90, 80, 70, 60, 50}의 내용만 변경하면 된다. 그러면 나머지 코드는 변경하지 않아도 된다
배열을 사용한 덕분에 프로그램을 전체적으로 잘 구조화 할 수 있다

-- 왜 []이것이 아니라 {} 이 것을 썼는지
{}는 특히 클래스, 메서드, 루프, 조건문 등의 내용을 정의하기 위해 코드 블록을 나타내는 데 사용됩니다.
 주어진 컨텍스트에서 {}는 배열을 초기화하는 데 사용되지 않고 오히려 배열의 내용을 정의합니다.
[]는 배열을 나타내는 데 사용됩니다.
주어진 맥락에서 int[] Students는 정수를 보유하는 students라는 배열을 선언합니다.
중괄호 {}는 값으로 배열을 초기화하는 데 사용됩니다.
 Java에서 int[] Students = {90, 80, 70, 60, 50};과 같은 내용이 표시되면 students라는 정수 배열을 선언하고 이를  값으로 초기화한다는 의미입니다. {90, 80, 70, 60, 50}.

이건 1차원 배열
 */