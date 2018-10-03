package Chapter05;

/*

 */

public class Question06 {
    public static void main(String[] args) {
        String[]  pillar = new String[]{"","A","B","C"};

        move(3,pillar,1,3);


    }

    public static void move(int no, String[] pillar, int x, int y) {
        if(no > 1) {
            move(no-1, pillar, x, 6-x-y);
        }
        System.out.println("원반[" + no + "]을 " + pillar[x] + " 기둥에서 " + pillar[y] + "기둥으로 옮김.");

        if(no > 1) {
            move(no-1, pillar ,6-x-y , y);
        }

    }
}
