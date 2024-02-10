package cond;
/*
do - while문은 최초 한번은 항상 실행된다 따라서 먼저 현재 숫자는 : 10이 출력된다
코드 블럭은 실행 후에 조건식을 검증하는데 i = 10이기 때문에 while(i<3) 조건식은 거짓이 된다. 따라서 do-while문을 빠져나온다
do- while 문은 최초 한번은 코드 블럭을 꼭 실행해야하는 경우에 사용하면 된다
 */
public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while( i < 3);
    }
}
