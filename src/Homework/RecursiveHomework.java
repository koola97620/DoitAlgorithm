package Homework;

/*
    https://www.acmicpc.net/problem/9095
    1,2,3 더하기
 */

import java.util.Scanner;

public class RecursiveHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int testCase = sc.nextInt();

        System.out.println(recur(10));




    }

    public static int recur(int num) {
        if(num==1) {
            return 1;
        }else if(num==2) {
            return 2;
        }else if(num==3) {
            return 4;
        }else {
            return recur(num-1) + recur(num-2) + recur(num-3);
        }

    }
}
