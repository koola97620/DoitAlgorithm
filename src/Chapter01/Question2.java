package Chapter01;

/*
    2. 세 값의 최솟값을 구하는 min3 메소드를 작성하세용!
 */

public class Question2 {
    public static int min3(int a,int b, int c) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }


        return min;
    }



    public static void main(String[] args) {
        System.out.println(min3(10,2,11));
    }
}
