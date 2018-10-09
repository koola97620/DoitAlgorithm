package Chapter06;

import java.util.Scanner;

public class Question10 {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];  // pivot

        System.out.printf("a[%d] ~ a[%d] : {",left,right);
        for(int i=left ; i < right ; i++) {
            System.out.printf("%d ," , a[i]);
        }
        System.out.printf("%d}\n", a[right]);

        do {
            while(a[pl] < x){
                pl++;
            }
            while(a[pr] > x) {
                pr--;
            }

            if(pl <= pr) {
                swap(a,pl++,pr--);
            }

        } while(pl <= pr);

        if(left < pr) quickSort(a,left,pr);
        if(pl < right) quickSort(a,pl,right);
    }

    static void quicksort(int[] a, int n) {
        quickSort(a,0,n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 9;
        int[] x = {5,8,4,2,6,1,3,9,7};

        quicksort(x,n);

        for(int i=0; i < n ; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }


    }
}
