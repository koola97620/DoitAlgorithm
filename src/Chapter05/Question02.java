package Chapter05;

/*
    2. 재귀 메서드 호출을 사용하지 않고 실습 5-2의 gcd메서드를 작성하세요.
 */

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : " );
        int x = sc.nextInt();

        System.out.println("정수를 입력하세요 : " );
        int y = sc.nextInt();

        System.out.println(gcd(x,y));


    }

    public static int gcd(int x, int y) {

        while(y != 0) {
            int temp = x;
            x=y;
            y= temp % y;
        }

        return x;
    }
}
