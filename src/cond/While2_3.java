package cond;
/*
    while문을 사용하면 원하는 횟수만큼 같은 코드를 반복 실행할 수 있따
 */
public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        // i =1, endNum = 3
        while(i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + "sum=" + sum);
            i++;
        }
    }
}
