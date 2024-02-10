package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String stautus;
        if (age >= 18){
            stautus = "성인";
        } else {
            stautus = "미성년자";
        }
        System.out.println("age = " + age + " status = " + stautus);
    }
}
