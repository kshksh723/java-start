package method;
/*
메서드 호출과 값 전달 2
메서드 호출과 이름이 같은 변수
    같은 문제를 호출자의 변수 이름과 매개변수의 이름을 같게 해서 한번 더 풀어보자
 */
public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : " + number); // 출력 5
        changeNumber(number); // changeNumber를 호출한다. main의 number(5)
        // number의 값을 읽는다
        System.out.println("4. changeNumber 호출 후, number : " + number); // 출력 5
    }

    public static void changeNumber(int number) {
        // main의 number값 5가 changeNumber의 number에 복사된다
        // 결과 : main의 number(5), changeNumber의 number(5)
        // void changeNumber(int number = 5)
        System.out.println("2. changeNumber 변경 전, number: " + number); // 출력 : 5
        // changeNumber의 number에 값 10을 대입한다
        // 결과 : main의 number(5), changeNumber의 number(10)
        number = number * 2;
        // main의 number를 출력한다 : main의 number의 값인 5가 출력된다
        System.out.println("3. changeNumber 변경 후, number : " + number ); // 출력 : 10
    }
}
/*
main()에 정의한 변수와 메서드의 파라미터 변수의 이름이 둘다 number로 같다

main()도 사실 메서드이다. 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
물론 이름이 같아도 완전히 다른 변수다. 따라서  main()의 number와 changeNumber()의 number는 서로 다른 변수이다
 */