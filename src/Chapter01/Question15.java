package Chapter01;

/*
    15. 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하시오.
    static void triangleLB(int n)

    그리고 왼쪽 위, 오른쪽 위 ,오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드를 작성하셈
    static void triangleLU(int n)
    static void triangleRU(int n)
    static void triangleRB(int n)
 */

import java.util.Scanner;

public class Question15 {
    public static void triangleLB(int n) {
        for(int i=0; i < n ; i++) {
            for(int j=0; j <=i ; j++) {
                System.out.print("*");
            } // for j

            System.out.println();
        } // for i

    }
    // 왼쪽 위
    public static void triangleLU(int n) {
        for(int i=0 ; i < n ; i++) {
            for(int j=n-i ; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 오른쪽 위
    public static void triangleRU(int n) {
        for(int i=0; i < n ; i++) {
            for(int j=0 ; j < n  ; j++) {
                if(i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
    // 오른쪽 아래.
    public static void triangleRB(int n) {
        for(int i=0; i < n ;i++) {
            for(int j=n-1; j >= 0 ; j--) {
                if(i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangleLB(n);
        System.out.println();
        System.out.println();

        triangleLU(n);

        triangleRU(n);

        triangleRB(n);

    }
}
