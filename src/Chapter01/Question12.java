package Chapter01;

/*
    12. 오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
 */

public class Question12 {
    public static void main(String[] args) {
        for(int i=1; i < 10 ; i++) {
            if(i == 1) {
                System.out.println("  |" + "1  2  3  4  5  6  7  8  9");
                System.out.println("--+-------------------------------");
            }

            System.out.print(i + "| ");
            for(int j=1 ; j < 10 ; j++) {
                System.out.print(i * j + "  ");
            } // for j

            System.out.println();
        } // for i
    } // main
}
