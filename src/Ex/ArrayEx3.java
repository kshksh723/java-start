package Ex;

import java.util.Scanner;


public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");

        for(int i = 0; i < 5; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        // 0,1,2,3,4
        for (int i = 4; i >= 0; i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(", ");
            }

        }
    }
}
