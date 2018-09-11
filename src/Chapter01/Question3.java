package Chapter01;


/*
    3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
 */


public class Question3 {

    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        if(d < min) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min4(10,2,4,9));
    }
}
