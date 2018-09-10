package Chapter01;

/*
    11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면
    '그 수는 3자리 입니다' 라고 출력하고, 1314를 입력하면 ' 그 수는 4자리 입니다' 라고 출력 하면 됩니다.
 */

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
//        이 방법 말고 다른 식으로!
//        int a = 1999;
//        String s = String.valueOf(a);
//        System.out.println(s.length());

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number <= 0) {
            System.out.println("0 보다 큰 숫자를 입력하세요.");
            number = sc.nextInt();
        }


        int num = 10; int count =0;


        do {
            number = number / num;
            count++;

        }while(number > 0);

        System.out.println(count + " 자리 숫자입니다.");

    }
}
