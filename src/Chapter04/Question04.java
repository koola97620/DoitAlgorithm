package Chapter04;

public class Question04 {
    public static void main(String[] args) {
        IntAryQueue queue = new IntAryQueue(10);

        queue.enque(1);
        queue.enque(3);
        queue.enque(4);
        queue.enque(2);
        queue.enque(7);
        queue.enque(8);
        queue.print();

    }

}


class IntAryQueue {
    private int max;
    private int num;
    private int[] que;

    public IntAryQueue(int capacity) {
        max = capacity;
        num = 0;
        que = new int[max];
    }

    public void enque(int x) {
        if(num >= max) {
            System.out.println("full");
            return;
        } else {
            que[num++] = x;
        }
    }

    public int deque() {
        if(num <= 0) {
            System.out.println("empty");
            return -1;
        } else {
            int x = que[0];
            for(int i=1 ; i< num ; i++) {
                que[i] = que[i+1];
            }
            num--;
            return x;
        }
    }

    public int peek() {
        return que[num -1];
    }

    public int indexOf(int x) {
        for(int i=0; i < num; i++) {
            if(que[i] == x) {
                return i;
            }
        }
        return -1; // 실패
    }

    public void print() {
        for(int i=0; i < num ; i++) {
            System.out.print(i + " : " + que[i] + "   ");
        }

    }

}
