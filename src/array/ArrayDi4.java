package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2*3 2차원 배열, 초기화
        int[][] arr = new int[2][3];
/*
구조 개선 - 값 입력

배열에 직접 1,2,3 숫자를 적어서 값을 할당하는 것이 아니라 배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력하도록 변경
 */


        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다
        for(int row = 0; row < arr.length; row++) {
            for( int column = 0; column < arr[row].length; column++) {
                arr[row][column] = ++i;
            }
        }

        // 2차원 배열의 길이 활용
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
        }
    }
}
