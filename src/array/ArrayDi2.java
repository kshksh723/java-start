package array;
public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열, 초기화
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        }; // 행2, 열3

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column]+ " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다
        }
    }   
}
/*
- for문을 2번 중첩해서 사용하는데 첫번째는 for문은 행을 탐색하고 내부에 있는 두번째 for문은 열을 탐색한다
- 내부에 있는 for문은 앞서 작성한 다음 코드와 같다 for문을 사용해서 열을 효과적으로 출력했다

System.out.print(arr[row][0]+ " "); // 0열 출력
System.out.print(arr[row][1]+ " "); // 1열 출력
System.out.print(arr[row][2]+ " "); // 2열 출력


[초기화]
1차원 배열은 다음과 같이 초기화한다
{1,2,3}

2차원 배열은 다음과 같이 초기화한다. 밖이 행이 되고, 안이 열이 된다. 그런데 이렇게 하면 행 열이 잘 안느껴진다
{{1,2,3}, {4,5,6}}

이렇게 라인을 적절하게 넘겨주면 행과 열이 명확해진다
{
    {1,2,3},
    {4,5,6}
}




            [배열의 길이]
for문에서 2차원 배열의 길이를 활용했다
    - arr.length는 행의 길이를 뜻한다. 여기서는 2가 출력된다
            --> {{},{}}를 생각해보면 arr 배열은 {},{} 2개의 배열 요소를 가진다
arr[row].length는 열의 길이를 뜻한다. 여기서는 3이 출력된다
    - arr[0]은 {1,2,3} 배열을 뜻한다. 이 배열은 3개의 요소가 있다
    - arr[1]은 {4,5,6} 배열을 뜻한다. 이 배열은 3개의 요소가 있다

 */
