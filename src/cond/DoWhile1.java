package cond;
/*
- do - while문 구조
do {
        //코드
    } while (조건식);

 */
public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;

        while (i<3){
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
// i=10이기 때문에 while(i<3) 조건식이 거짓이 된다 아무것도 출력되지 않는다