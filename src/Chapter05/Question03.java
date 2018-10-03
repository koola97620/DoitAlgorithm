package Chapter05;


/*
    3. 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
 */

public class Question03 {
    public static void main(String[] args) {
        int a[] = new int[]{22,8,30,20,38};
        int number = 5;

        System.out.println(gcdArray(a,0,number));

    }

    public static int gcd(int x, int y) {

        while(y != 0) {
            int temp = x;
            x=y;
            y= temp % y;
        }

        return x;
    }

    public static int gcdArray(int[] a, int first, int number) {
        if(number == 1) {
            return a[first];
        } else if(number == 2) {
            return gcd(a[first] , a[first+1]);
        }else {
            return gcd(a[first], gcdArray(a,first+1,number-1));
        }

    }
}
