package method;
/*
메서드와 형변환
메서드를 호출할 때도 형변환이 적용된다
메서드 호출과 명시적 형변환, 자동 형변환에 대해 알아보자

[[명시적 형변환]]
메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 어떻게 해야할까
 */
public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        // pringNumber(number); // double을 int 형에 대입하므로 컴파일 오류
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);

    }
}
