package method;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2, 2);
    }
    public static void myMethod(int a, double b){
        System.out.println("int a, double b");

    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
/*
1 : 정수1, 실수 1.2를 호출했으므로 myMethod(int a, double b)가 호출된다
2 : 실수  1.2, 정수 2를 호출했으므로 myMethod(double a, int b)가 호출된다
 */