package Chapter06;

import java.util.Scanner;

public class QuickSort2 {
    static void swap(int[] a , int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void quicksort(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right -left +1);
        IntStack rstack = new IntStack(right -left +1);


        lstack.push(left);
        rstack.push(right);

        while(lstack.isEmpty() != true) {
            int pl = left = lstack.pop(); // 왼쪽 커서
            int pr = right = rstack.pop(); // 오른쪽 커서
            int x = a[(left + right) /2]; // pivot

            System.out.printf("a[%d] ~ a[%d] : {",left,right);
            for(int i=left ; i < right ; i++) {
                System.out.printf("%d ," , a[i]);
            }
            System.out.printf("%d}\n", a[right]);

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
