package Chapter01;

/*
    17. 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하셈!!!
 */

public class Question17 {
    public static void npira(int n) {

        for(int i=0; i <  n; i++) {
            for(int j=1 ; j <= (n-1)*2 +1 ; j++) {
                if(n-i <= j && j <= n+i) {
                    System.out.print((i+1)%10);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        npira(4);

    }
}
