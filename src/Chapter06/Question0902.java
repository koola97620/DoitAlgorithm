package Chapter06;

import java.util.Scanner;

public class Question0902 {
    static int count=0;


    public static void shellSort(int[] a , int n) {
        int h;
        for(h=1 ; h < n/9 ; h=h*3 +1)
            ;

        for( ; h>0 ; h /=3) {
            for(int i=h ; i < n ; i++) {
                int j;
                int tmp = a[i];
                for(j = i-h ; j >= 0 && a[j] > tmp ; j= j-h) {
                    a[j+h] = a[j];
                    count++;
                }
                a[j+h] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sheel ver1");
        System.out.print("n : ");
//        int n = sc.nextInt();
//        int[] x = new int[n];
//        int n = 7;
//        int[] x = {22,5,11,32,120,68,70};
        int n = 8;
        int[] x = {8,1,4,2,7,6,3,5};


        shellSort(x,n);

        System.out.println("after sort");
        for(int i=0; i < n ;i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("count : "  + count);

    }
}
