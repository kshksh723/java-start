package casting;
/*
형변환과 오버플로우
- 형변환을 할 때 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면 어떻게 될까?
 */
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;  //int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue;   //형변환
        System.out.println("maxIntValue casting=" + intValue); //2147483647

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting=" + intValue); //-2147483648
    }
}
/*
[정상 범위]
long maxIntValue = 2147483647를 보면 int로 표현할 수 있는 가장 큰 숫자인 2147483647를 입력했다
이 경우 int로 표현할 수 있는 범위에 포함되기 때문에 다음과 같이 long -> int로 형변환을 해도 아무런 문제가 없다
intValue = (int) maxIntValue;   // 형변환


어떻게 수행되는지 확인해보자
maxIntValue = 2147483647;   //int 최고값
intValue = (int) maxIntValue;   //변수 값 읽기
intValue = (int) 2147483647;    //형변환
intValue = 2147483647;

[초과범위]

long maxIntOver = 2147483648L를 보면 int로 표현할 수 있는 가장 큰숫자인 2147483647보다 1큰 숫자를 입력했다 이 숫자는 리터럴은
int 범위로 넘어가기 때문에 마지막에 L을 붙여서 long 형을 사용해야한다
이 경우 int로 표현할 수 있는 범위를 넘기 때문에 다음과 같이 long -> int로 형변환하면 문제가 발생한다

intValue = (int) maxIntOver;    // 형변환

maxIntOver = 2147483648L;   // int 최고값 + 1
intValue = (int)maxIntOver; //변수 값 읽기
intValue = (int) 2147483648L;   // 형변환 시도
intValue = -2147483648;

-- 결과를 보면 -2147483648이라는 전혀 다른 숫자가 보인다. int 형은 2147483648L를 표현할 수 있는 방법이 없다. 이렇게 기존 범위를 초과해서
표현하게 되면 전혀 다른 숫자가 표현되는데 이런 현상을 오버플로우라고 한다

-- 보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것처럼 다시 처음부터 시작한다 참고로 -2147483648 숫자는 int의 가장 작은 숫자이다
-- 중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 점이다
    오버플로우 자체가 발생하지 않도록 막아야 한다. 이 경우 단순히 대입하는  변수(intValue)의 타입을 int -> long으로 변경해서 사이즈를
    늘리면 오버플로우 문제가 해결된다
 */