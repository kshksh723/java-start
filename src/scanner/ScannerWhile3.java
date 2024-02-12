package scanner;

import java.util.Scanner;
/*
사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성해야한다
사용자는 한 번에 한개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료 된다. 이 때 프로그램이 종료될 때까지
사용자가 입력한 모든 정수의 합을 출력해야 한다
 */
public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;    // 이곳에 사용자가 입력한 값을 누적한다
        while (true){
            System.out.println("정수를 입력하세요 (0을 입력하면 종료) : ");
            int number = input.nextInt();

            if(number == 0) {
                break;
            }
            sum += number;  // 사용자가 입력한 number 값을 sum에 누적해서 더한다
                            // +=을 사용했으므로 다음 코드와 같다 : sum = sum + number

        }
        System.out.println("입력한 모든 정수의 합 : " + sum);


    }
}
