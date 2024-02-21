package Ex;

import java.util.Scanner;

public class ArrayEx4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double avg;

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        avg = (double)sum / count;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);

    }
}
