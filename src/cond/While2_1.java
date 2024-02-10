package cond;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1; // sum(0) + 1 -> sum(1)
        System.out.println("i=" + 1 + " sum = " + sum);

        sum = sum + 2; // sum(1) +2 -> sum(3)
        System.out.println("i=" + 2 + " sum = " + sum);

        sum= sum + 3; // sum(3) + 3 -> sum(6)
        System.out.println("i="+ 3 + " sum = " + sum);
    }
}

/*
이 코드의 정답은 맞다 하지만 개선 상황이 필요하다 => 변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자
변경되는 부분을 변수 i로 바꾸어보자
 */