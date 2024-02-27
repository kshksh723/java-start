package method;
/*
메서드 오버로딩
 */
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1. " + add(1,2));
        System.out.println("2. " + add(1,2,3));

    }
    // 첫번째 add 메서드 : 두 정수를 받아서 합을 반환한다
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a+ b;
    }

    // 두 번째 add 메서드 : 세 정수를 받아서 합을 반환한다
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a+b+c;
    }
}
/*
1: 정수 1,2를 호출했으므로 add(int a, int b)가 호출된다
2: 정수 1,2,3을 호출했으므로 add(int a, int b, int c)가 호출된다
 */