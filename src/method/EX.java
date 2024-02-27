package method;

public class EX {
    /*
    메서드 호출과 용어정리

    메서드를 호출할 때는 다음과 같이 메서드에 넘기는 값과 매개변수(파라미터)의 타입이 맞아야 한다
    물론 넘기는 값과 매개변수(파라미터) 순서와 갯수도 맞아야 한다

    호출 : call("hello", 20)
    메서드 정의 : int call(String str, int age)


    인수(Argument)
            여기서 "hello", 20처럼 넘기는 값을 영어로 Argument, 한글로는 인수 또는 인자(전달하는 수)라 한다


    매개변수(Parmeter)
            메서드를 정의할 때 선언한 변수인 String str, int age를 매개변수, 파라미터라 한다
            메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다

            실무에서는 매개변수, 파라미터 용어를 모두 사용한다



    <용어 정리>
        - 인수 : "들어가는 수"라는 의미, 즉 메서드 내부로 들어가는 값을 의미한다. 인자도 같은 의미이다
        - 매개변수(parameter) : '중간에서 전달하는 변수'라는 의미. 즉, 메서드 호출부와 메서드 내부 사이에 값을 전달하는 역할을 하는 변수라는 뜻




        -- 메서드의 정의

        public static int add(int a, int b) {
                // 메서드 본문, 실행코드
          }

         제어자 반환타입 메서드메서드이름(매개변수 목록) {
                메서드 본문
           }

           -- 제어자(Modifier) : public, static과 같은 부분이다. 항상 public static 키워드를 입력하자
           -- 반환 타입(Return Type) : 메서드가 실행된 후 반환하는 데이터의 타입을 지정한다. 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 void를 사용해야한다
                                        ex) void print(String str)
           -- 메서드 이름(Method Name) : 메서드 이름이다. 이 이름은 메서드를 호출하는데 사용된다
           -- 매개변수(Parameter) : 입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다. 입력값이 필요없는 메서드는 매개변수를 지정하지 않아도 된다
                                    예) add()
           --메서드 본문(Method Body) : 실제 메서드의 코드가 위치한다. 중괄호 {} 사이에 코드를 작성한다



           [메서드 오버로딩]

           다음과 같은 메서드를 만들고 싶다
            - 두 수를 더하는 메서드
            - 세 수를 더하는 메서드

            이 경우 둘 다 더하는 메서드이기 때문에 가급적 같은 이름인 add를 사용하고 싶다
            자바는 메서드의 이름뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다
            따라서 다음과 같이 이름이 같고 매개변수가 다른 메서드를 정의할 수 있다

            오버로딩 성공
            add(int a, int b)
            add(int a, int b, int c)
            add(double a, double b)

           이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(Overloading)이라 한다
           오버로딩은 번역하면 과적인데, 과하게 물건을 담았다는 뜻이다. 따라서 같은 이름의 메서드를 여러개 정의했다고 이해하면 된다

           오버로딩 규칙
           메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환 타입은 인정하지 않는다
           다음 케이스는 메서드 이름과 매개변수의 타입이 같으므로 컴파일 오류가 발생한다
            반환 타입은 인정하지 않는다

            오버로딩 실패
            int add(int a, int b)
            double add(int a, int b)

            용어 : 메서드 시그니처(method signature)
            메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
            메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다. 메서드 시그니처는 메서드 이름과 매개변수 타입(순서 포함)으로 구성 되어 있다
            쉽게 이야기해서 메서드를 구분할 수 있는 기준이다. 자바 입장에서는 각각의 메서드를 고유하게 구분할 수 있어야 한다. 그래야 어떤 메서드를 호출 할 지 결정할 수 있다
            따라서 메서드 오버로딩에서 설명한 것 처럼 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다
            반환 타입은 시그니처에 포함되지 않는다. 방금 오버로딩이 실패한 두 메서드를 보자. 두 메서드는 add(int a, int b)로 메서드 시그니처가 같다.
            따라서 메서드의 구분이 불가능하므로 컴파일 오류가 발생한다


     */
}
