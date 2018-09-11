package Chapter01;

/*
    9. 정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하셈!
 */

public class Question9 {

    public static int sumof(int a, int b) {
        int sum =0;
        int start = 0;
        int end =0;

        start = a>=b ? b : a ;
        end = a >= b ? a : b ;


        for(int i = start ; i <= end  ; i++) {
            sum += i;
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumof(6,4));

    }
}
