package cond;

public class odd_Even {
    
    /*
    2/2 = 1, 나머지 없음 -> 짝수
    3/2 = 1, 나머지 1  -> 홀수
    4/2 = 2, 나머지 없음 -> 짝수
    5/2 = 2, 나머지 1 - > 홀수
     */
    public static void main(String[] args) {
        int x = 2;

        String result = (  x % 2 == 0) ? "짝수" : "홀수 ";
        System.out.println("x ="+ x + ", "+ result);
    }
}
