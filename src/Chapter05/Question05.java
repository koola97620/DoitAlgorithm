package Chapter05;

/*
static void recur3(int n) {
    if(n>0) {
        recur3(n-1);
        recur3(n-2);
        System.out.println(n);
    }
}

이 메소드를 비 재귀적으로 구현하시오.
 */
public class Question05 {
    public static void main(String[] args) {
        int i = 3;

        if(i-- == 3) {
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);

    }

    public static void recur3(int n) {



    }

}
