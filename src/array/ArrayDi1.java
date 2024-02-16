package array;
/*
2차원 배열 - 리펙토링 1

구조 변경
코드 구조를 보면 비슷한 부분이 반복된다
// 0 행 출력
System.out.print(arr[0][0] + " ") // 0열 출력
System.out.print(arr[0][1] + " ") // 1열 출력
System.out.print(arr[0][2] + " ") // 2열 출력
System.out.println(); // 한 행이 끝나면 라인을 변경한다

//1 행 출력
System.out.print(arr[1][0] + " ") // 0열 출력
System.out.print(arr[1][1] + " ") // 1열 출력
System.out.print(arr[1][2] + " ") // 2열 출력
System.out.println(); // 한 행이 끝나면 라인을 변경한다

--> 코드를 보면 행을 출력하는 부분이 거의 같다. 차이가 있는 부분은 행에서 arr[0]으로 시작할지 arr[1]로 시작할지의 차이다

다음과 같이 행(row)에 들어가는 숫자만 하나씩 증가하면서 반복하면 될 것 같다
// row를 0,1로 변경하면서 다음 코드를 반복
System.out.print(arr[row][0] + " ") // 0열 출력
System.out.print(arr[row][1] + " ") // 1열 출력
System.out.print(arr[row][2] + " ") // 2열 출력
System.out.println(); // 한 행이 끝나면 라인을 변경한다


 */
public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다
        int[][] arr = new int[2][3];    // 행, 열

        arr[0][0] = 1;  // 0행, 0열
        arr[0][1] = 2;  // 0행, 1열
        arr[0][2] = 3;  // 0행, 2열
        arr[1][0] = 4;  // 1행, 0열
        arr[1][1] = 5;  // 1행, 1열
        arr[1][2] = 6;  // 1행, 2열

        for (int row = 0; row < 2; row++) {
            System.out.print(arr[row][0] + " "); // 0열 출력
            System.out.print(arr[row][1] + " "); // 1열 출력
            System.out.print(arr[row][2] + " "); // 2열 출력
            System.out.println(); // 한 행이 끝나면 라인을 변경한다
        }
    }
}
/*
for 문을 통해서 행(row)을 반복해서 접근한다. 각 행 안에서 열(column)이 3개이므로 arr[row][0], arr[row][1], arr[row][2]
3번 출력한다. 이렇게하면 for문을 한번 도는 동안 3개의 열을 출력할 수 있다
-- row=0의 for문이 실행되면 arr[0][0], arr[0][1], arr[0][2]로 123이 출력된다
-- row=1의 for문이 실행되면 arr[1][0], arr[1][1], arr[1][2]로 456이 출력된다

 */