package Chapter01;

import java.util.Scanner;

/*
    7. 실습 1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7 = 28'로 출력하는 프로그램을 작성하셈!
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n가지의 합을 구합니다.");
        System.out.println("n의 값");
        int n = sc.nextInt();

        int sum  = 0;

        for(int i=1 ; i < 8 ; i++) {
            sum += i;
            if(i==7) {
                System.out.print(i);
            }else {
                System.out.print(i + " + ");
            }
        }
        System.out.print(" = " + sum);
    }
}
