package Chapter04;

public class Gstack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    // 실행할 때 예외：스택이 비어 있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {
        }
    }

    // 실행할 때 예외：스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }

    public Gstack (int capacity) {
        max = capacity;
        ptr = 0;
        try {
            stk = (E[]) new Object[max];
        }catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public E push(E x) throws OverflowGstackException  {
        if(ptr >= max) {
            throw new OverflowGstackException();
        }
        return stk[ptr++] = x;
    }

    public E pop() {
        if(ptr <= 0) {
            throw new EmptyGstackException();
        }
        return stk[--ptr];
    }

    public E peek() {
        if(ptr <= 0) {
            throw new EmptyGstackException();
        }
        return stk[ptr -1];
    }

    public void print() {
        if(ptr <= 0 ) {
            throw new EmptyGstackException();
        } else {
            for(int i=0  ; i < ptr ; i++) {
                System.out.print(i + " : " + stk[i] + "    ");
            }
            System.out.println();
        }
    }


}
