package method;

public class Method2 {
    public static void main(String[] args) {
        // String str = printHeader(); --> 컴파일 오류
    printHeader();
        System.out.println("프로그램이 동작합니다.");
    printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 = ");
        return; // 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 = ");
    }
}
/*
printHeader(), printFooter() 메서드는 매개변수가 없고 반환 타입도 없다
       -- 매개변수가 없는 경우
               ㅁ 선언 : public statiac void printHeader()와 같이 매개변수를 비워두고 정의하면 된다
               ㅁ 호출 : printHeader(); 와 같이 인수를 비워두고 호출하면된다
       -- 반환 타입이 없는 경우
               ㅁ 선언 : public static void printHeader()와 같이 반환 타입을 void로 정의하면된다
               ㅁ 호출 : printHeader();와 같이 반환 타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다
                     - String str = printHeader(); 반환 타입이 void이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생한다




 void와 return 생략
 모든 메서드는 항상 return을 호출해야 한다 그런데 반환 타입 void의 경우에는 예외로 printFooter()와 같이 생략해도 된다
 자바 컴파일러가 반환 타입이 없는 경우에는 return을 마지막줄에 넣어준다 참고로 return을 만나면 해당 메서드는 종료된다

 */