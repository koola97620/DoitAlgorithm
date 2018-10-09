package Chapter06;

public class exam   {
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    public static void main(String[] args) {
        int[] a = {3,5,7,9,11};

        int x = a[2];
        swap(a,2,4);
        System.out.println(x);

    }
}
