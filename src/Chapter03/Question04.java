package Chapter03;

public class Question04 {

    public static int binarySearch(int[] x, int num) {

        int start =0;
        int end = x.length -1;

        do {
            System.out.print("   |");

            int middle = (start + end) /2;

            if(start != middle) {
                System.out.printf(String.format("%%%ds<-%%%ds+", (start * 4) + 1, (middle - start) * 4), "", "");
            } else {
                System.out.printf(String.format("%%%ds*", (middle * 4)+1), "");
            }

            if(middle != end) {
                System.out.printf(String.format("%%%ds->\n", (end - middle) * 4 - 2), "");
            }else {
                System.out.println("->");
            }



            System.out.print("   |");
            for(int i=0; i < x.length ; i++) {
                System.out.printf("%4d" , x[i]);
            }
            System.out.println();



            if(x[middle] == num) {
                return middle;
            } else if(x[middle] < num) {
                start = middle +1;
            } else {
                end = middle -1;
            }

        }while (start <= end);

        return -1;
    }

    public static void main(String[] args) {
        int num = 2;

        System.out.println("찾으려는 수 : " + num);

        int[] nums = new int[]{1,2,3,5,6,8,9};

        System.out.printf("%4s", "|");
        for(int i=0 ; i < nums.length ; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("---+");
        for(int i=0; i < nums.length * 4 ; i++) {
            System.out.print("-");
        }
        System.out.println();


        int idx = binarySearch(nums , num);
        System.out.println("idx = " + idx);
        if(idx == -1) {
            System.out.println("배열에 값이 없습니다.");
        }else {
            System.out.println(num + " 값은 x[" + idx + "] 에 있습니다." );
        }

    }
}
