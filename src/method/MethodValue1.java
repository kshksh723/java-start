package method;
/*
[메서드 호출과 값 복사]
숫자를 2배 곱하는 메서드이다
 */
public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + num1);
        changeNumber(num1); // changeNumber를 호출한다 num1(5) --> changeNumber(5) --> num1의 값을 읽는다
        System.out.println("4. changeNumber 호출 후, num1 : " + num1);
    }

    public static void changeNumber(int num2) { // void changeNumber(int num2= 5),, num1의 값 5가 num2에 복사된다. 결과 : num1(5), num2(5)
        System.out.println("2. changeNumber 변경 전, num2 : " + num2);
        num2 = num2 * 2;    // num2에 2를 곱한다. 결과 : num1(5), num2(5)
        // num2 = 5 * 2; // num2의 값을 읽어서 2를 곱한다. 결과 : num1(5), num2(10)
        // num2 = 10;  // num2에 계산 결과인 값 10을 대입한다 결과 : num1(5), num2(10)
        // num2를 출력한다 : num2의 값인 10이 출력된다
        // num1을 출력한다 : num1의 값인 5가 출력된다
        System.out.println("3. changeNumber 변경 후, num2 : " + num2);
    }
}

/*
자바는 항상 변수의 값을 복사해서 대입한다

결과적으로 매개변수 num2의 값만 10으로 변경되고 num1의 값은 변경되지 않고 기존 값인 5로 유지된다. 자바는 항상 값을 복사해서 전달하기 때문에
 num2의 값을 바꾸더라도 num1에는 영향을 주지 않는다
 */