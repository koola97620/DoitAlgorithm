package Chapter01;

/*
    14. 입력한 수를 한 변으로 하는 정사각형을 *기호로 출력하는 프로그램을 작성하셈!
 */

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i < n ; i++) {
            for(int j=0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
