package Chapter01;


/*
    1. 네 값의 최댓값을 구하는 max4 메서드를 작성하셈!
 */

public class Question1 {


    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }

        return max;
    }



    public static void main(String[] args) {

        System.out.println(max4(4,2,9,2));

    }
}
