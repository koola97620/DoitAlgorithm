package Chapter01;

/*
    16. n단의 피라미드를 출력하는 메서드를 작성하셈!!!
 */

public class Question16 {

    public static void spira(int n) {

        for(int i= 0 ; i < n  ; i++) {
            for(int j=1 ; j <= (n-1)*2 +1 ; j++) {
                if(n-i <= j && j <= n+i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        spira(4);

    }
}
