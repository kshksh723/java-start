package array;
/*
        2차원 배열 - 리펙토링 2

        구조 개선 - 초기화, 배열의 길이
        이 코드르 보니 2가지 개선할 부분이 있다
        1. 초기화 : 기존 배열 처럼 2차원 배열도 편리하게 초기화 할 수 있다
        2. for문에서 배열의 길이 활용 : 배열 길이가 달라지면 for문에서 row < 2, column < 3 같은 부분을 같이 변경해야 한다
            이 부분을 배열의 길이를 사용하도록 변경해보자. 배열이 커지거나 줄어들어도 for문의 코드를 변경하지 않고 그대로 유지할 수 있다
 */
public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열. 초기화
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        }; // 행 2, 열3

        // 2차원 배열의 길이 활용

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }

    }


}

//arr[row].length --> arr에 첫번째 row의 길이
//