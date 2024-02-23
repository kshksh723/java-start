package method;
/*
    메서드 사용
    자바에서는 함수를 메서드(Method)라 한다
    메서드도 함수의 한 종류라고 생각하면 된다


 */
public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력 : " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과 2 출력 : " + sum2);
    }
    
    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return  sum;


    }
}
/*
중복이 제거됨


 -- 메서드 정의 ---
 public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return  sum;


    }
 이 부분이 바로 메서드이다 이것을 함수를 정의하는 것과 같이, 메서드를 정의한다고 표현한다
 메서드는 수학의 함수와 유사하게 생겼다. 함수에 값을 입력하면 어떤 연산을 처리한 다음에 결과를 반환한다

 메서드는 크게 메서드 선언과 메서드 본문으로 나눌 수 있다

 메서드 선언(Method Declaration)
 public static int add(int a, int b)
 메서드 선언 부분으로 메서드 이름, 반환 타입, 파라미터 목록을 포함한다
 이름 그대로 이런 메서드가 있다고 선언하는 것이다. 메서드 선언 정보를 통해 다른 곳에서 해당 메서드를 호출할 수 있다


 - public static
 -- public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다
 -- static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다

 - int add(int a, int b) --> 중요
 -- int : 반환 타입을 정의한다. 메서드의 실행 결과를 반환 할 때 사용할 반환 타입을 지정한다
 -- add : 메서드에 이름을 부여한다. 이 이름으로 메서드를 호출 할 수 있다
 -- (int a, int b) : 메서드를 호출할 때 전달하는 입력 값을 정의한다. 이 변수들은 해당 메서드 안에서만 사용된다. 이렇게 메서드 선언에 사용되는 변수를 영어로
 파라미터(parameter), 한글로 매개변수라 한다



 [메서드 본문]
{
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return  sum;
}
-- 메서드가 수행해야하는 코드 블록이다
-- 메서드를 호출하면 메서드 본문이 순서대로 실행된다
-- 메서드 본문은 블랙박스이다 메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다
-- 메서드의 실행 결과를 반환하려면 return문을 사용해야한다. return문 다음에 반환할 결과를 적어주면 된다
        --> return sum : sum 변수에 들어있는 값을 반환한다

    [메서드 호출]
    - 앞서 정의한 메서드를 호출해서 실행하려면 메서드 이름에 입력 값을 전달하면 된다. 보통 메서드를 호출한다고 표현한다
            int sum1 = add(5, 10);
            int sum2 = add(15, 20);

            메서드를 호출하면 어떻게 실행되는 지 순서대로 확인해보자
                int sum1 = add(5, 10); // add라는 메서드를 숫자 5, 10을 전달하면서 호출한다
                int sum1 = 15; // add(5,10)이 실행된다. 실행 결과는 반환 값은 15이다
                // sum1에 15 값이 저장된다
                -- 메서드를 호출하면 메서드는 계산을 끝내고 결과를 반환한다
                쉽게 말하자면 메서드 호출이 끝나면 해당 메서드가 반환한 결과값으로 치환된다

 */