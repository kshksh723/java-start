package scanner;

import java.util.Scanner;
/*
Scanner 반복 예제 1
- 사용자가 입력한 문자열 그대로 출력하는 예제를 만들어보자
- exit라는 문자가 입력되면 프로그램을 종료한다
- 프로그램을 반복해서 실행된다
 */
/*
while (true) : 중간에 break문을 만나기 전까지 무한반복한다
if (str.equals("exit")) {
    System.out.println("프로그램을 종료합니다");
    break;
  }
  --> 입력 받은 문자가 "exit"이면 "프로그램을 종료합니다"를 출력하고 break문을 통해서 while문을 빠져 나간다
 */

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문자열을 입력하세요(exit : 종료) :");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("프로그램을 종료한다");
                break;
            }
            System.out.println("입력한 문자열 : " + str);

        }


    }
}
