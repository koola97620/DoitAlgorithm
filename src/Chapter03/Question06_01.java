package Chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Question06_01 {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 오름차순 정렬위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements  Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.height > o2.height) ? 1 :
                        (o1.height < o2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나영", 162, 0.3),
                new PhyscData("유지훈",168,0.4),
                new PhyscData("김한결",169,0.8),
                new PhyscData("홍준기", 171 , 1.5),
                new PhyscData("전서현" , 173, 0.7),
                new PhyscData("이호연", 174, 1.2),
                new PhyscData("이수민", 175, 2.2),
        };

        System.out.println("몇 cm 인 사람을 찾냐? ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(x,new PhyscData("",height,0.0) , PhyscData.HEIGHT_ORDER);

        if(idx < 0) {
            System.out.println("대상이 없습니다.");
        } else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 :  " + x[idx]);
        }

    }
}
