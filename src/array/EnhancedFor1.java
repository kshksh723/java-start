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

        for (int number : numbers) {

        }

            // 일반  for문
        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }



        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

         /*
        - 일반 for문과 동일하게 작동한다
        - 향상된 for문은 배열의 인덱스를 사용하지 않고, 종료 조건을 주지 않아도 된다. 단순히 해당 배열을 처음부터 끝까지 탐색한다
        - :의 오른쪽에 numbers와 같이 탐색할 배열을 선택하고 :의 왼쪽에 int number와 같이 반복할 때마다 찾은 값을
        저장할 변수를 선언한다 그러면 배열의 값을 하나씩 꺼내서 왼쪽에 있는 number에 담고 for문을 수행한다
        for문의 끝에 가면 다음 값을 꺼내서 number에 담고 for문을 반복수행한다
        numbers 배열의 끝에 도달해서 더 값이 없으면 for문이 완전히 종료된다
        - 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 때문에 코드가 간결하고 가독성이 좋다
         */


        // for - each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        /*
        향상된 for문에는 증가하는 인덱스 값이 감추어져있다 따라서 int i와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우에는
        향상된 for문을 사용할 수 없다

         */
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
        }
// 이 예제는 증가하는 i 값을 출력해야 하므로 향상된 for문 대신에 일반 for문을 사용해야한다



        for(int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }

// 일반 for문
        int i = 0;
        for (int number : numbers ) {
            System.out.println("number" + i +"번의 결과는 : " + number);
             i++;

        }
    }
}
//numbers => 배열에 있는 값을 돌아준다

// 실무에서 향상된 for문을 자주 쓴다


