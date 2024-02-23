package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0; // 할인은 0원

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 10000원 할인");
        } else if (age <= 10) {
            discount = discount + 10000;
            System.out.println("어린이  1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액 : " + discount + "원");

        if (false)
            System.out.println("if 문에서 실행됨");

            System.out.println("if 문에서 실행안됨");
    }

}

/* if 문 다음에 실행할 명령이 하나만 있을 경우에는 {} 중괄호를 생략할 수 있다, else if, else도 마찬가지다
    ex) if(true) 
           System.out.println("if문에서 실행됨");
           
-    만약 둘다 if 문 안에 포함하려면 다음과 같이 {}를 사용해야한다
      if( true)
        System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행안됨");
        
    * 일반적으로 if 문의 명령이 한개만 있을 경우에도 중괄호를 사용하는 것이 좋다
 
 
 
 */