package Chapter03;

import java.util.Scanner;

public class Question2 {


    public static int seqSearchSen(int[] a , int n , int key) {

        a[n] = key;
        int i=0;

        for(i=0 ; i < n ; i++) {
            if(i==0) {
                System.out.print("   |");
                for(int j=0; j < n ; j++) {
                    System.out.printf("%4d", j);
                }
                System.out.print("\n---+");
                for(int k=0; k < n * 4 ; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|" , i);
            for(int j=0 ; j < n ; j++) {
                System.out.printf("%4d" , a[j]);
            }
            System.out.println();


            if(a[i] == key) {
                break;
            }
        }

        return i == n ? -1 : i;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = sc.nextInt();
        int[] x = new int[num+1];

        for(int i=0; i < num ; i++) {
            System.out.print("x[" + i +  "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = seqSearchSen(x,num,ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "] 에 있습니다.");
        }

    }

    public static void printSeq(int[] x , int num , int ky) {

    }
}
