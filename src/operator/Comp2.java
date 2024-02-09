package operator;

public class Comp2 {
    public static void main(String[] args) {
        /* 문자열이 같은지 비교할 때는 ==이 아니라 .equals() 메서드를 사용해야한다
        ==를 사용하면 성공할 때도 있지만 실패할 때도 있다
        문자열의 비교는 .equals() 메서드를 사용해야한다
         */
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str2.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean reuslt3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(reuslt3);


    }
}
