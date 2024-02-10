package cond;
/*
1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
1+2+3+... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다
 */

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(; ;){
            sum += i; //sum = sum+i
            if ( sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum = "+ sum);
                break;
            }
            i++;
        }
    }
}
// 무한반복하는 코드임
/*
for(;;)를 보면 조건식이 없다. for문은 조건이 없으면 무한 반복한다
sum > 10 조건을 만족하면 break를 사용해서 while문을 빠져 나간다

 for문은 증가하는 값이 무엇인지 초기식과 증감식을 통해서 쉽게 확인할 수 있다. 이 코드나 while문을 보면 어떤 값이 반복에 사용되는 증가
 값인지 즉시 확인하기는 어렵다
 여기서는 i가 증가하는 값이다. 따라서 다음과 같이 i를 for문에 넣어서 관리하도록 변경하면 더 깔끔한 코드가 된다
 */