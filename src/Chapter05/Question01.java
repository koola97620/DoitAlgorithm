package Chapter05;

/*
    factorial 을 재귀를 사용하지 않고 구현.
 */

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(sc.nextInt()));


    }

    public static int factorial(int n) {

        int result=1;
        for(int i=1; i <=n ; i++) {
            result = result * i;
        }


        return result;
    }
}
