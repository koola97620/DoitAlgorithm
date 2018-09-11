package Chapter01;

/*
    13. 12번 문제를 덧셈으로.
 */


public class Question13 {
    public static void main(String[] args) {
        for(int i=1; i < 10 ; i++) {
            if(i == 1) {
                System.out.println("  |" + "1  2  3  4  5  6  7  8  9");
                System.out.println("--+-------------------------------");
            }

            System.out.print(i + "| ");
            for(int j=1 ; j < 10 ; j++) {
                System.out.print(i + j + "  ");
            } // for j

            System.out.println();
        } // for i

    }
}
