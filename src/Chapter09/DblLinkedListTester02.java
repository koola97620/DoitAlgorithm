package Chapter09;

import java.util.Comparator;

public class DblLinkedListTester02 {
    public static Comparator<Integer> PurgeComparator = new PurgeComparator();

    private static class PurgeComparator implements Comparator<Integer> {
        public int compare(Integer d1, Integer d2) {
            return (d1 > d2) ? 1 : (d1 < d2) ? -1 : 0;
        }
    }


    public static void main(String[] args) {
        DblLinkedList list = new DblLinkedList<Integer>();

        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.dump();

//        list.purge(PurgeComparator);
//        System.out.println("===================purge==================");
//
//        list.dump();

        System.out.println("size : " + list.size());

        System.out.println(list.retrieve(0));
    }
}
