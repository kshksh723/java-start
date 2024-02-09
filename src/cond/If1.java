package cond;


    /*  특정 조건에 따라서  다른 코드를 실행하는 것을 조건문이라고 한다
        조건문에는 if문, switch문이 있다. 둘다 특정 조건에 따라서 다른 코드를 실행하는 것이라 생각하면 된다
    
        if문은 특정 조건이 참인지 확인하고, 그 조건이 참(true)일 경우 특정 코드 블록을 실행한다
        코드 블록 : {} (중괄호) 사이에 있는 코드

        if(condition) {
        // 조건이 참일 때 실행되는 코드
        }


     */
public class If1 {
    public static void main(String[] args) {

        int age = 20; // 사용자 나이

        if(age >= 18) {

            System.out.println(" 성인입니다. ");

        }
        if(age < 18 ) {
            System.out.println("미성년자입니다");
        } // 해당 코드 블록은 실행되지 않는다
    }
}
