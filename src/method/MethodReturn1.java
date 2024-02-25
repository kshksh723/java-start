package method;
/*
    반환 타입
    = 반환 타입이 있으면 반드시 값을 반환해야 한다
        반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야 한다
        이 부분은 특히 조건문과 함께 사용할 때 주의해야 한다
 */



public class MethodReturn1 {
    /*   public static void main(String[] args) {
           boolean result = odd(2);
           System.out.println(result);
       }

       public static boolean odd (int i) {
           if (i % 2 == 1) {
               return true;
           }

       }
   }*/
/*
이 코드에서 if 조건이 만족할 때는 true가 반환되지만, 조건을 만족하지 않으면 어떻게 될까? 조건을 만족하지 않은 경우네는 return문이 실행되지 않는다
따라서 이 코드를 실행하면 return문을 누락했다는 다음과 같은 컴파일 오류가 발생한다

 java: missing return statement --> 컴파일 오류


 */
    public static void main(String[] args) {

        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
/*
이렇게 수정하면 if 조건을 만족하지 않아도 else를 통해 return문이 실행된다
 */