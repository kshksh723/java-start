package Ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        // 시작 : 코드를 작성하세요
        temp = a; // 10
        a = b;
        b = temp;
        // 종료 : 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
- a와 b를 한번에 서로 교환할 수는 없다
a = b라고 하면 a의 값인 10은 사라져 버린다 따라서 a, b 둘다 20이 되버린다
a = b라고 하기 전에 a의 값을 어딘가에 보관해두어야 한다. 여기서는 임시로 사용할 변수인 temp에 보관해두었다
 */
