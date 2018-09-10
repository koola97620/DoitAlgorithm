package Chapter01;

/*
    10. 오른쪽과 같이 두 변수 a,b 에 정수를 입력하고 b - a 를 출력하는 프로그램을 작성하셈.
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a 의 값 : " + a);
        System.out.println("b 의 값 : " + b);

        do {
            System.out.println("a보다 큰 값을 입력하세요!");
            b = sc.nextInt();
        }while(a >= b);

        System.out.println("b-a 는 " + (b - a));


    }
}
