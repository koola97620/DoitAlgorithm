package Chapter06;

import java.util.Scanner;

public class Question15 {
    static void swap(int[] a , int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }


    static void insetSort(int[] a, int left, int right) {
        for(int i= left +1 ; i <= right ; i++) {
            int tmp = a[i];
            int j;
            for(j=i ; j > 0 && a[j-1] > tmp ; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;

        }
    }

    static int median(int[] x, int a, int b, int c) {
        if(x[b] < x[a]) {
            swap(x,b,a);
        }
        if(x[c] < x[b]) {
            swap(x,c,b);
        }
        if(x[c] < x[a]) {
            swap(x,c,a);
        }
        return b;
    }


    static void quicksort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right -left +1);
        IntStack rstack = new IntStack(right -left +1);


        lstack.push(left);
        rstack.push(right);

        while(lstack.isEmpty() != true) {
            int pl = left = lstack.pop(); // 왼쪽 커서
            int pr = right = rstack.pop(); // 오른쪽 커서

            if(right - left <= 9) {
                insetSort(a,left,right);
            }else {
                //int x = a[(left + right) /2]; // pivot
                int x;
                int m = median(a,pl,(pl+pr)/2 , pr);
                x=a[m];
                swap(a,m,right-1);
                pl++;
                pr--;

                do {
                    while(a[pl] < x) pl++;
                    while(a[pr] > x) pr--;

                    if(pl <= pr) {
                        swap(a,pl++,pr--);
                    }
                } while(pl <= pr);

                if (pr - left < right - pl) {
                    int temp;
                    temp = left;
                    left = pl;
                    pl = temp;
                    temp = right;
                    right = pr;
                    pr = temp;
                }


                if(left < pr) {
                    lstack.push(left);
                    rstack.push(pr);
                }
                if(pl < right) {
                    lstack.push(pl);
                    rstack.push(right);
                }


            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 8;
        int[] x = {6,5,4,2,7,3,1,8};

        quicksort(x,0,n-1);


        for(int i=0; i < n ; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
