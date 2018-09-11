package Chapter01;

/*
    6. 실습 1-4에서 while문이 종료될 때 변수 i 값이 n+1이 됨을 확인하세요!( 변수 i 값을 출력하도록 프로그램을 수정하셈!)
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n가지의 합을 구합니다.");
        System.out.println("n의 값");
        int n = sc.nextInt();

        int sum  = 0;
        int i=1;

        while(i <= n) {
            sum += i;
            i++;
            System.out.println(i);
        }
        System.out.println("합은 sum = " + sum);
    }
}
