package Ex;

import java.util.Scanner;

/*
이름과 나이 반복
- 사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요
사용자가 "종료"를 입력하면 프로그램이 종료되어야 한다
 */
public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = sc.nextLine();


            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("나이를 입력하세요 : ");
            int age = sc.nextInt(); // 10\n
            sc.nextLine(); // \n

            System.out.println("입력한 이름 : " + name + ", 나이 :" + age);
        }
    }
}
