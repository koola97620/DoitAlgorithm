package Chapter04;

public class Question02 {
    public static void main(String[] args) {
        Gstack<String> stack = new Gstack<String>(5);

        stack.push("HIHI");
        stack.push("HELLO");
        stack.push("HI");
        stack.push("GOOD");

        stack.print();
    }

}
