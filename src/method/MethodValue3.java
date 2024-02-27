package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 : " + num1); // 출력 : 5
         num1 = changeNumber(num1); // num1 (5)
        //num1 = changeNumber(5);

        // 호출 시작 : changeNumber()
        // num1의 값 5가 num1의 값을 num2에 복사한다 num1(5), num2(5)
        System.out.println("changeNumber 호출 후, num1: " + num1); // 출력 : 10

    }

    public static int changeNumber(int num2) { // int changeNumber(int num2= 5)
        num2 = num2 * 2; // 계산 결과 : num1(5), num2(10)
        return num2; // num2의 값은 10이다
      //  return 10;
        //호출 끝 :  changeNumber()

        // num1 = changeNumber(5); // 반환결과는 10이다
        // num1 = 10; // 결과 : num1(10)


    }
}


/*
정리!!
자바는 항상 변수의 값을 복사해서 대입한다

결국 참조형 변수에 있는 값인 참조값을 복사하는 것이다
 */