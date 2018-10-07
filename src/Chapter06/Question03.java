package Chapter06;

public class Question03 {

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
        for(int i=0 ; i  < n-1 ; i++) {
            int exchangeCount = 0;

            System.out.print("Case #" + (i+1));
            System.out.println();
            for(int j=n-1 ; j > i ; j--) {

                if(a[j-1] > a[j]) {
                    print(a,j);
                    swap(a,j,j-1);
                    exchangeCount++;

                }else {
                    print(a,j);
                }
                System.out.println();
            }


            print(a,0);

            if(exchangeCount == 0) {
                System.out.println();
                System.out.println((i+1) + "번째 case에서 교환횟수가 0 이므로 정렬을 종료합니다.");
                break;
            }

            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[] = {6,4,3,7,1,9,8};
        int n = a.length;

        System.out.println("before sort");
        bubble(a,n);


    }
}
