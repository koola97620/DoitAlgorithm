package Chapter04;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int capacity) {
        max = capacity;
        front = 0;
        rear = 0;
        num = 0;
        que = new int[max];
    }

    public int enque(int x) throws OverflowIntQueueException {
        if(num >= max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();

        int x = que[front++];
        num--;
        if(front == max) {
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int indexOf(int x) {
        for(int i=0; i < num  ; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }
    public int size() {
        return num;
    }
    public void print() {
        if(num<=0)
            System.out.println(" 빈 스택");
        else {
            for(int i=0; i < num; i++) {
                System.out.print(i + " : " + que[(i + front) % max] + "     ");
            }
            System.out.println();
        }
    }

    public int search(int x) {
        for(int i=0; i < num ; i++) {
            if(que[(i + front) % max] == x) {
                return i+1;
            }
        }

        return 0;
    }


}
