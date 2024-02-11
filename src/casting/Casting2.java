package casting;
/*
 명시적 형변환

  // intValue = doubleValue;
 java : incompatible types : possible lossy conversion from double to int
 // java : 호환되지 않는 유형: double에서 int로는 가능한 손실 변한
 */
public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue;  //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue);   // 출력 : 1

        int z = (int) 10.5;
        System.out.println(z); //10
        System.out.println("doubleValue = " + doubleValue); //1.5
    }
}
/*
int 형은 double 형보다 숫자의 표현 범위가 작다. 그리고 실수르 표현할 수도 없다.
 따라서 이 경우 숫자가 손실되는 문제가 발생할 수 있다 쉽게 이야기해서 큰 컵에 담긴 물을 작은 컵에 옮겨 담으려고 하니, 손실이 발생할 수 있다는
 것이다. 이런 문제는 매우 큰 버그를 유발할 수 있다
 예를 들어서 은행 프로그램이 고객에게 은행 이자를 계산해서 입금해야하는 데 만약 이런 코드가 아무런 오류 없이 수행된다면 끔찍한 문제를 만들 수 있다
 그래서 자바는 이런 경우 컴파일 오류를 발생시킨다. 항상 강조하지만 컴파일 오류는 문제를 가장 빨리 발견할 수 있는 좋은 오류이다



 [ 형변환]
데이터 타입을 강제로 변경할 수 있다
예를 들어서 대략적인 결과를 보고 싶은데, 이 때 소수점을 버리고 정수로만 보고 싶을 수 있다

형변환은 다음과 같이 변경하고 싶은 데이터 타입을 (int)와 같이 괄호를 사용해서 명시적으로 입력하면 된다
intValue = (int) doubleValue; // 형변환
이 것을 형(타입)을 바꾼다고 해서 형변환이라 한다. 영어로는 캐스팅이라 한다. 그리고 개발자가 직접 형변환 코드를 입력한다고 해서 명시적
형변환이라 한다


캐스팅 용어
"캐스팅"은 영어 단어 "cast"에서 유래되었다
"cast"는 금속이나 다른 물질을 녹여서 특정한 형태나 모양으로 만드는 과정을 의미한다

[명시적 형변환 과정]
// doubleValue = 1.5
intValue = (int) doubleValue;
intValue = (int) 1.5; //doubleValue에 있는 값을 읽는다
intValue = 1; // (int)로 형변환한다. intValue에 int형인 숫자 1을 대입한다

형변환 후 출력해보면 숫자 1이 출력되는 것을 확인할 수 있다
-- 중요--
참고로 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것은 아니다
doubleValue에서 읽은 값을 형변환하는 것이다. doubleValue 안에 들어있는 값은 1.5로 그대로 유지된다
참고로 변수의 값은 대입연산자(=)를 사용행해서 직접 대입할 때만 변경된다

  */