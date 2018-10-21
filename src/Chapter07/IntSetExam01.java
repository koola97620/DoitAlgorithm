package Chapter07;

public class IntSetExam01 {
    public static void main(String[] args) {
        IntSet s1 = new IntSet(20);
        IntSet s2 = new IntSet(20);
        IntSet s3 = new IntSet(20);

        s1.add(10);
        s1.add(15);
        s1.add(20);
        s1.add(25);

        s1.copyTo(s2);
        s2.add(12);
        s2.remove(25);

        s3.copyFrom(s2);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

//        s1.clear();
//        System.out.println(s1.isEmpty());
//        System.out.println("s1 = " + s1);

        IntSet s4 = new IntSet(5);
        s4.add(10);
        s4.add(15);
        s4.add(20);

        System.out.println("s4 = " + s4);



        s1.unionOf(s1,s2);
        System.out.println("s1 = " + s1);

//        s1.retain(s3);
//        System.out.println("s1 = " + s1);
//        s1.retain(s3);
//        System.out.println("s1 = " + s1);
//        s1.remove(s3);
//        System.out.println("s1 = " + s1);

//        System.out.println(s4.isProperSubsetOf(s1));

//        s3.intersectionOf(s1,s2);
//        System.out.println("s3 = " + s3);

//        s3.differenceOf(s1,s4);
//        System.out.println("s3 = " + s3);

        IntSortedSet ss = new IntSortedSet(10);
        ss.add(20);
        ss.add(10);
        ss.add(70);
        ss.add(50);
        ss.add(40);
        System.out.println("ss : " + ss);
        ss.sort();
        System.out.println("sort ss : " + ss);






    }





}
