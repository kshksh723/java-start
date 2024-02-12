package Ex;

/*
    입력한 숫자의 합계와 평균
    - 사용자로부터 여러 개의 숫자를 입력 받고 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요
    사용자는 숫자를 입력하고 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다
    - 모든 숫자의 입력이 끝난 후에는 숫자들의 합계 sum과 평균 average를 출력하세요. 평균은 소수점 아래까지 계산해야 합니다

 */
import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        /*while (true){
            input = sc.nextInt();

            if(input == -1){
                break;
            }
            sum += input;
            count ++; //평균을 구하려면 몇개인지 알아야함


        }*/

        while ((input = sc.nextInt()) != -1) {
            sum += input;
            count++;

        }
        double avg = (double) sum /count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
/*
반복문 실행
while((input = sc.nextInt()) != -1) // 사용자 3입력
while((input = 3) != -1) // input에 3 대입
while((input(3) != -1) //input의 값 읽기
while((3) != -1) // ()제거
while(3 != -1) // 부등식 연산
while(true) // while문 실행

반복문 종료
while((input = sc.nextInt()) != -1) // 사용자 -1입력
while((input = -1) != -1) // input에 -1 대입
while((input(-1) != -1) // () 제거
while(-1 != -1) // 부등식 연산
while( false) // while문 종료

문제 - 상품구매

- 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 충 가격을 출력하는 프로그램을 작성하세요. 사용자는 여러 상품을 추가하고
결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
- 사용자에게 다음 세 가지 옵션을 제공해야 합니다 : 1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료, 옵션은 정수로 입력받으며, 옵션을 저장하는
변수의 이름은 option이어야 합니다
- 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요
- 결제 옵션을 선택하면, 총 비용을 출력하고 총 비요은 0으로 초기화하세요. (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정합니다. 
따라서 다음 사용자를 위해 총 비용을 0으로 초기화 해야한다)



 */
