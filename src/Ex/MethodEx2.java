package Ex;
/*
반복 출력 리펙토링
-- 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다
 */
public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    }

}