package cond;
/*
    else문은 if 문에서 만족하는 조건이 없을 때 실행하는 코드를 제공한다
    if (condition) {
    // 조건이 참일 때 실행되는 코드

   } else {
   // 만족하는 조건이 없을 때 실행되는 코드
   }
 */
public class If2 {
    public static void main(String[] args) {
            int age = 20;
        
            if(age >= 18) {
                System.out.println("성인입니다");
            }else {
                System.out.println("미성년자입니다");
            }
    }
}
