package scanner;

import java.util.Scanner;
/*
- 첫번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자
- 첫번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다
- 프로그램은 반복해서 실행된다
 */
/*
 if(num1 == 0 && num2 == 0) {
                System.out.println(" 프로그램 종료 ");
                break;
            }
           num1 == 0 && num2 == 0 --> 
           1) 입력 받은 num1, num2 둘다 함께 0일 때 "프로그램 종료"를 출력하고 break를 통해 while문을 빠져나간다
           2) 비교 연산자를 사용했다 true && true -> true이다. 따라서 두 조건이 모두 참이어야 if문의 코드 블럭이 실행된다 
 */

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램을 종료한다. ");
        while (true){
            System.out.print("첫번째 숫자를 입력하시오 : ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하시오 : ");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0) {
                System.out.println(" 프로그램 종료 ");
                break;
            }
            int sum = num1 + num2;
        }

    }
}
