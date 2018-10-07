package Chapter06;

public class Question01 {
    static void swap(int[] a, int idx1 , int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void print(int[] a) {
        for(int k : a) {
            System.out.print(k + " ");
        }
    }

    static void bubble(int a[], int n) {
        for(int i=0 ; i  < n-1 ; i++) {
            System.out.print("Case #" + (i+1) + " : ");
            for(int j=i ; j < n-1 ; j++) {
                if(a[j] > a[j+1]) {
                    swap(a,j,j+1);
                }
            }
            print(a);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {22,5,11,32,120,68,70};
        int n = a.length;

        System.out.println("before sort");
        print(a);
        System.out.println();

        bubble(a,n);
    }
}
