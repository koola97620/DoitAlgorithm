package Chapter04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IntQueueTest {
    public static void main(String[] args) {
        IntQueue que =  new IntQueue(5);

        que.enque(1);
        que.enque(2);
        que.enque(3);
        que.enque(4);
        que.enque(5);

        System.out.println(que.size());


        que.print();
    }
}
