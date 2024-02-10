package cond;
/*
    정리하자면 for문이 없이 while문으로 모든 반복을 다를 수 있다. 하지만 카운터 변수가 명확하거나, 반복 횟수가 정해진 경우에는 for문을
    사용하는 것이 구조적으로 더 깔끔하고 유지보수하기 좋다

    <참고>
    for문을 좀 더 편리하게 사용하도록 도와주는 향상된 for문 또는 for-each문으로 불리는 반복문도 있다
 */

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;


        for(int i = 1; ;i++){
            sum += i; //sum = sum+i
            if ( sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum = " + sum);
                break;
            }
        }
    }
}
