package Chapter03;

import java.util.Scanner;

public class Question03 {

    public static int searchIdx(int[] a , int n, int[] idx) {
        int count = 0;
        for(int i=0 ; i < a.length ; i++) {
            if(a[i] == n) {
                idx[count++] = i;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.print("찾고 싶은 수 ? ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] a = new int[] {10,1,7,4,2,4,6,8,2,10};

        // 찾으려는 수의 갯수가 a.length 보다 작을 것이다.
        // a.length 길이 만큼 만드는건 저장공간 낭비.

        int[] idx = new int[a.length];
        int result = searchIdx(a,number,idx);

        for(int i=0; i <  result ; i++) {
            System.out.println(number + " 값은 " + idx[i] + " 에 있습니다.");
        }


    }
}
