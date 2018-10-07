package Chapter06;

public class Question04 {
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
            String str =" ";
            if(i == idx - 1) {
                if(a[idx-1] > a[idx]) {
                    str="+";
                    System.out.print(a[i] + str);
                } else {
                    str ="-";
                    System.out.print(a[i] + str);
                }

            } else {
                System.out.print(a[i] + str);
            }
        }
    }


    static void bubble(int a[], int n) {
        int k=0;
        while(k < n-1) {
            int last = n-1;
            System.out.print("Case #" + (k+1));
            System.out.println();
            for(int j=n-1 ; j > k ; j--) {
                compareCount++;
                if(a[j-1] > a[j]) {
                    print(a,j);
                    swap(a,j,j-1);
                    last = j;
                    swapCount++;
                }else {
                    print(a,j);
                }
                System.out.println();
            }
            System.out.println("last    :   " + last);
            print(a,0);
            k = last;
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {6,4,3,7,1,9,8};
        int n = a.length;

        System.out.println("before sort");
        bubble(a,n);

        System.out.println("비교를 " + compareCount + " 회 했습니다.");
        System.out.println("교환을 " + swapCount + " 회 했습니다.");
    }
}
