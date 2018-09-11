package Chapter01;

/*
    4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
 */


public class Question4 {
    public static int median3(int a, int b, int c) {
        if(a >= b) {
            if(c <= b) {
                return b;
            } else if(a <= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b <= c) {
                return b;
            }else if(c <= a) {
                return a;
            }else {
                return c;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("median(3,2,1) = " + median3(3,2,1));
        System.out.println("median(3,2,2) = " + median3(3,2,2));
        System.out.println("median(3,1,2) = " + median3(3,1,2));
        System.out.println("median(3,2,3) = " + median3(3,2,3));
        System.out.println("median(2,1,3) = " + median3(2,1,3));
        System.out.println("median(3,3,2) = " + median3(3,3,2));
        System.out.println("median(3,3,3) = " + median3(3,3,3));
        System.out.println("median(2,2,3) = " + median3(2,2,3));
        System.out.println("median(2,3,1) = " + median3(2,3,1));
        System.out.println("median(1,3,2) = " + median3(1,3,2));
        System.out.println("median(2,3,3) = " + median3(2,3,3));
        System.out.println("median(1,2,3) = " + median3(1,2,3));

    }
}
