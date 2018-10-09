package Chapter06;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    // 스택 비어있을 때 예외.
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 스택 가득찼을 때 예외.
    public class OverflowIntStackException extends  RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자.
    public IntStack(int capacity) {
        max = capacity;
        ptr = 0;
        try {
            stk = new int[max];
        } catch(OutOfMemoryError e) {
            max =0;
        }
    }

    // push
    public int push(int x) throws OverflowIntStackException{
        if(ptr == max) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    // pop
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0 ) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    //peek
    public int peek() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr-1];
    }

    // 값 찾기.
    public int indexOf(int x) {
        for(int i= ptr -1 ; i >= 0 ; i--) {
            if(stk[i] == x) {
                return i;
            }
        }
        return -1; //실패.
    }

    // 스택 비움.
    public void clear() {
        ptr = 0;
    }

    // 스택 용량 반환
    public int capacity() {
        return max;
    }

    // 데이터 수 반환
    public int size() {
        return ptr;
    }

    // 스택 비어있는지 유무
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득찼는가
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택 안의 모든 데이터를 바닥에서 꼭대기 순으로 출력.
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for(int i=0; i < ptr ; i++) {
                System.out.print(stk[i] + "  ");
            }
            System.out.println();
        }
    }

}
