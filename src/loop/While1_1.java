package loop;
/*
자바는 3가지 종류의 반복문을 제공
while, do-while, for
 */
public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);

    }
}
/*
단순히 count 값을 1씩 3번 더하는 단순한 예제이다 최종 결과는 3이다

count = count + 1은 증감연산자(++)을 증감 연산자(++)를 사용해서 다음과 같이 개선할 수 있다
// 개선
count++;
System.out.println("현재 숫자는 :" + count);
count++;
System.out.println("현재 숫자는 :" + count);
count++;
System.out.println("현재 숫자는 :" + count);

-- 특정 코드를 반복해서 사용하는 것이 바로 반복문이다
 */