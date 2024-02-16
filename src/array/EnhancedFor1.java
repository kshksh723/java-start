package array;

/*
        향상된 for문
        향상된 for문(Enhanced For Loop)이다.
        향상된 for문을 이해하려면 배열을 먼저 알아야 한다. 각각의 요소를 탐색한다는 의미로
        for-each문이라고도 많이 부른다
        향상된 for문은 배열을 사용할 때 기존 for문보다 더 편리하게 사용할 수 있다


         [향상된 for문 정의]
         for (변수 : 배열 또는 컬렉션) {
         // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
         }
 */
public class EnhancedFor1 {
    public static void main(String[] args) {
            int[] numbers = {1,2,3,4,5};

            // 일반  for문
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }
        // for - each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }
    }
}
//numbers => 배열에 있는 값을 돌아준다

// 실무에서 향상된 for문을 자주 쓴다