package method;
/*
메서드 시작
 두 숫자를 입력 받아서 더하고 출력하는 단순한 기능을 개발해보자
 먼저 1+2를 수행하고, 그 다음으로 10 +20을 수행할 것이다
 */
public class Method1 {
    public static void main(String[] args) {
        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a+b;
        System.out.println("결과 1 출력 : " + sum1);

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + "연산 수행");
        int sum2 = x+ y;
        System.out.println("결과 2 출력 : " + sum2);
    }
}
/*
 -- 같은 연산을 두 번 수행한다
 -- 코드를 잘 보면 계산 1부분과 계산 2 부분이 거의 같다

 계산1,계산2 둘 다 변수를 두 개 선언하고 어떤 연산을 수행하는지 출력하고 두 변수를 더해서 결과를 구한다
 만약 프로그램의 여러 곳에서 이와 같은 계산을 반복해야 한다면? 같은 코드를 여러번 반복해서 작성해야 할 것이다
 더 나아가서 어떤 연산을 수행하는 지 출력하는 부분을 변경하거나 또는 제거하고 싶다면 해당 코드를 다 찾아다니면서 모두 수정해야 할 것이다
 */