package Chapter04;


/*
    이상함.
 */

public class Question07 {
    public static void main(String[] args) {
        IntDeque deck = new IntDeque(5);
        deck.enqueFront(1);
        deck.enqueRear(5);

        deck.dump();
        System.out.println(deck.getSize());
    }
}


class IntDeque {
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] que;

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }
    public int getSize() {
        return num;
    }

    public IntDeque(int capacity) {
        max = capacity;
        num =0;
        front =0;
        rear =0;
        que = new int[max];
    }

    // 실행할 때 예외：큐가 비어 있음
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {
        }
    }

    // 실행할 때 예외：큐가 가득 참
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {
        }
    }

    public void enqueFront(int x) {
        if(num >= max) {
            throw new OverflowIntDequeException();
        }
        num++;
        if(++front > max) {
            front =0;
        }
        que[front++] = x;
    }

    public void enqueRear(int x) {
        if(num >= max) {
            throw new OverflowIntDequeException();
        }
        num++;
        que[rear++] = x;
        if(rear == max) {
            rear = 0;
        }
    }

    public int dequeFront() {
        if(num <= 0) {
            throw new EmptyIntDequeException();
        }
        int x = que[front++];
        num--;
        if(front == max){
            front = 0;
        }

        return x;
    }

    public int dequeRear() {
        if(num <= 0) {
            throw new EmptyIntDequeException();
        }
        num--;
        if(--rear < 0) {
            rear = max-1;
        }
        return que[rear--];
    }

    public void dump() {
        if (num <= 0)
            System.out.println("덱(deck)이 비었습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % max] + " ");
            System.out.println();
        }
    }


}