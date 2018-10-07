package Chapter06;

public class Question05 {
    static int swapCount = 0;
    static int compareCount = 0;


    static void swap(int[] a, int idx1 , int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    // Case 내에서 한줄 출력 하는 용도야~
    static void print(int[] a, int idx) {
        for(int i=0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
    }


    static void bubble(int a[], int n) {
        int left = 0;
        int right = n-1;
        int last = right;

        while(left < right) {
            for(int i = right ; i > left ; i--) {
                if(a[i-1] > a[i]) {
                    swap(a,i-1,i);
                    last = i;
                }
            }
            left = last;

            for(int i=left ; i < right ; i++) {
                if(a[i] > a[i+1]) {
                    swap(a,i,i+1);
                    last = i;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        int a[] = {9,1,3,4,6,7,8};
        int n = a.length;

        System.out.println("before sort");
        print(a,n);

        System.out.println();System.out.println();
        System.out.println("after sort");
        bubble(a,n);
        print(a,n);

    }
}
