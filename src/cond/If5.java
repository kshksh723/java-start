package cond;
/*
if문에 else if 를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다. 그런데 서로 관련이 없는 독립 조건이면 else if를 사용하지 않고 if문을
각각 따로 사용해야 한다

// 예시 1. if-else 사용 : 서로 연관된 조건이어서 하나로 묶을 때
    if (condition1) {
    // 작업1 수행
    } else if (condition2) {
    // 작업2 수행
    }
// 예시 2. if 각각 사용 : 독립 조건일 때
    if (condition1) {
        // 작업1 수행
    }
    if (condition2) {
        // 작업2 수행
    }
    -> 예시 1은 작업 1, 작업 2 둘 중 하나만 수행된다
        예시 2는 조건만 맞다면 둘다 수행될 수 있다
        
        * if문에 여러 조건이 있다고 항상 if-else로 묶어서 사용할 수 있는 것은 아니다. 조건이 서로 영향을 주지 않고 각각 수행해야하는 경우에는 else if문을 사용하면
        안되고, 대신에 여러 if문을 분리해서 사용해야한다
        여러 독립적인 조건을 검사해야하는 경우가 그런 상황의 대표적인 예시이다. 즉, 각 조건이 다른 조건과 연관되지 않고, 각각의 조건에 대해 별도의 작업을 수행해야할 때 
        이런 상황이 발생한다


 */
public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10; 
        int discount = 0; // 할인은 0원
        
        if(price >=10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 10000원 할인");
        }
        if (age <= 10){
            discount = discount + 10000;
            System.out.println("어린이  1000원 할인");
        }
        System.out.println("총 할인 금액 : " + discount + "원");
    }
}
