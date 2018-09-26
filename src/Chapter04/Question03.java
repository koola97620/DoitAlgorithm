package Chapter04;

public class Question03 {
    public static void main(String[] args) {
        intStackAB stack = new intStackAB(10);

        stack.push(intStackAB.AorB.StackA, 1);
        stack.push(intStackAB.AorB.StackA, 2);
        stack.push(intStackAB.AorB.StackA, 3);

        stack.push(intStackAB.AorB.StackB, 4);
        stack.push(intStackAB.AorB.StackB, 5);
        stack.push(intStackAB.AorB.StackB, 6);

        stack.dump(intStackAB.AorB.StackA);
        System.out.println("ptrA : " + stack.getPtrA());
        System.out.println(stack.peek(intStackAB.AorB.StackA));


        stack.pop(intStackAB.AorB.StackA);

        System.out.println("ptrA : " + stack.getPtrA());
        System.out.println(stack.peek(intStackAB.AorB.StackA));
        stack.dump(intStackAB.AorB.StackA);


        System.out.println("==============================");
        stack.dump(intStackAB.AorB.StackB);
        System.out.println("ptrB : " + stack.getPtrB());
        System.out.println(stack.peek(intStackAB.AorB.StackB));


        stack.pop(intStackAB.AorB.StackB);

        System.out.println("ptrB : " + stack.getPtrB());
        System.out.println(stack.peek(intStackAB.AorB.StackB));
        stack.dump(intStackAB.AorB.StackB);



    }
}


class intStackAB {
    private int ptrA;
    private int ptrB;
    private int max;
    private int[] stk;

    public enum AorB {
        StackA , StackB
    }
    public int getPtrA() {
        return ptrA;
    }
    public int getPtrB() {
        return ptrB;
    }

    // 실행할 때 예외：스택이 비어 있음
    public class EmptyIntStackXException extends RuntimeException {
        public EmptyIntStackXException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public class OverflowIntStackXException extends RuntimeException {
        public OverflowIntStackXException() {
        }
    }

    public intStackAB(int capacity) {
        max = capacity;
        ptrA=0;
        ptrB=capacity - 1;
        stk = new int[max];
    }

    public int push(AorB sw ,int x) {
        if(ptrA >= ptrB +1) {
            throw new OverflowIntStackXException();
        }
        switch(sw) {
            case StackA:
                stk[ptrA++] = x;
                break;
            case StackB:
                stk[ptrB--] = x;
                break;
        }
        return x;
    }

    public int peek(AorB sw) throws EmptyIntStackXException{
        int x =0;
        switch (sw) {
            case StackA:
                x = stk[ptrA-1];
                break;
            case StackB:
                x = stk[ptrB+1];
                break;
        }
        return x;
    }

    public int pop(AorB sw) throws EmptyIntStackXException{
        int x =0;
        switch (sw) {
            case StackA:
                x=stk[--ptrA];
                break;
            case StackB:
                x=stk[++ptrB];
                break;
        }
        return x;
    }


    public void dump(AorB sw) {
        switch (sw) {
            case StackA:
                if (ptrA <= 0)
                    System.out.println("스택이 비었습니다.");
                else {
                    for (int i = 0; i < ptrA; i++)
                        System.out.print(i + " : " + stk[i] + "    ");
                    System.out.println();
                }
                break;
            case StackB:
                if (ptrB >= max - 1)
                    System.out.println("스택이 비었습니다.");
                else {
                    for (int i = max - 1; i > ptrB; i--)
                        System.out.print(i + " : " + stk[i] + "    ");
                    System.out.println();
                }
                break;
        }
    }
}
