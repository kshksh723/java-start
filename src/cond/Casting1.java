package cond;

/*
            자동 형변환
    [형변환]
    - 작은 범위에서 큰 범위로는 당연한 값을 넣을 수 있다
            예 ) int -> long -> double
    - 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다
            > 소수점 버림
            > 오버플로우

    [작은 범위에서 큰 범위로 대입을 허용한다]
        자바에서 숫자를 표현할 수 있는 범위는 다음과 같다
        int < long < double
        int 보다는 long이, long 보다는 double이 더 큰 범위로 표현할 수 있다

        작은 범위에서 큰 범위에 값을 대입하는 다음 코드를  실행하면 특별한 문제 없이 잘 수행된다
 */
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); // longValue = 10

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue = " + doubleValue);
    }
}
/*
    - 자바는 기본적으로 같은 타입에 값을 대입할 수 있다 그런데 다른 타입에 값을 대입하면 어떻게 될까?
    - int -> long을 비교해보면 long이 int보다 더 큰 숫자 범위를 표현한다. 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입을 하면
        문제가 되지 않는다. 만약 이런 경우까지 오류가 발생한다면 개발이 너무 불편할 것이다
    - long -> double의 경우에도 double은 부동 소수점을 사용하기 때문에 더 큰 숫자 범위를 표현한다
 */