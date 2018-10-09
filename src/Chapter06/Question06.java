package Chapter06;

public class Question06 {
    public static void main(String[] args) {
        // test
        int j;
        int i = 3;
        int a[] = {5,11,22,32,120};
        int tmp = a[i];
        for(j = i ; j > 0 && a[j-1] > tmp ; j--  ) {
            System.out.println(j);
        }
        System.out.println(j);
        System.out.println(7 / 2);
    }
}
