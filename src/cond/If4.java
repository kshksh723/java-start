package cond;
/*
    else if문은 앞선 if문의 조건이 거짓일 때 다음 조건을 검사한다
    만약 앞선 if문이 참이라면 else if를 실행하지 않는다

    if-else

    if(condition1) {
        // 조건 1이 참일 때 실행되는 코드
     } else if (condition2) {
        // 조건 1이 거짓이고, 조건 2가 참일 때 실행되는 코드
     } else if (condition3) {
        // 조건2이 거짓이고, 조건 3이 참일 때 실행되는 코드
     } else {
        // 모든 조건이 거짓일 때 실행되는 코드
     }


        */
public class If4 {
    public static void main(String[] args) {


        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if(age <= 19){
            System.out.println("고등학생");
        }  else {
            System.out.println("성인");
        }
    }
}
