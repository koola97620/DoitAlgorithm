package Chapter06;

import java.util.Scanner;

public class Question0901 {
    static int count =0;

    static void shellSort(int[] a , int n) {
        for(int h = n/2 ; h >0 ; h /=2)
            for(int i=h ; i < n ; i++) {
                int j;
                int tmp = a[i];
                for(j = i - h ; j>=0 && a[j] > tmp ; j=j-h) {
                    a[j+h] = a[j];
                    count++;
                }
                a[j+h] = tmp;
            } // end i

    } // end sort()


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sheel ver1");
        System.out.print("n : ");
//        int n = sc.nextInt();
//        int[] x = new int[n];
        int n = 8;
        int[] x = {8,1,4,2,7,6,3,5};

//        for(int i=0; i<n ; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = sc.nextInt();
//        }

        shellSort(x,n);

        System.out.println("after sort");
        for(int i=0; i < n ;i++) {
            System.out.println("x[" + i + "] = " + x[i]);

        }

        System.out.println("count : " + count);


    }
}
