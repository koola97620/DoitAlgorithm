package Chapter06;

public class ExamBubbleSort {

    static void swap(int[] a , int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void print(int[] a) {
        for(int k : a) {
            System.out.print(k+ " ");
        }
    }

    static void bubbleSort(int[] a) {
        for(int i=0; i < a.length - 1 ; i++) {
            System.out.print("Case #" + (i+1) + " : ");
            for(int j= a.length -1 ; j > i ; j--) {
                if(a[j-1] > a[j]) {
                    swap(a,j-1,j);
                }

            }
            print(a);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {22,5,11,32,120,68,70};

        System.out.println("before sort");
        print(a);
        System.out.println();

        bubbleSort(a);
    }


}
