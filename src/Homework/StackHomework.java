package Homework;

/*
 url : https://programmers.co.kr/learn/courses/30/lessons/42586?language=java

progresses  speeds      return
[93,30,55]  [1,30,5]    [2,1]


예제 1)
progresses : [40, 93, 30, 55, 60, 65]
speeds : [60, 1, 30, 5 , 10, 7]
return : [1,2,3]

예제 2)
progresses : [93, 30, 55, 60, 40, 65]
speeds : [1, 30, 5 , 10, 60, 7]
return : [2,4]

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackHomework {
    public static int[] solution(int[] progresses, int[] speeds) {

        int[] days = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();


        for(int i=0; i < progresses.length ; i++) {
            days[i] = (int)Math.ceil((double)(100-progresses[i])/(double)speeds[i]);
            queue.add(days[i]);
        }

        int k = queue.peek();
        int task = 0;
        List<Integer> list = new ArrayList<Integer>();

        while(!queue.isEmpty()) {
            if(queue.peek() <= k) {
                if(queue.size()==1) {
                    list.add(task);
                }
                task++;
                queue.poll();
            }else if(queue.peek() > k) {
                list.add(task);
                task = 1;
                if(queue.size() == 1) {
                    list.add(task);
                }
                k = queue.poll();

            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i < answer.length ; i++) {
            answer[i] = list.get(i).intValue();
        }




        return answer;
    }
    public static void main(String[] args) {
//        double a = (double)70/(double)30;
//        System.out.println(Math.ceil(a));

        int[] progresses = {40,93,30,55,60,65};
        int[] speeds = {60,1,30,5,10,7};   // 답 1,2,3

        int[] result = solution(progresses,speeds);

        for(int k : result) {
            System.out.println(k);
        }

    }
}


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] days = new int[progresses.length];

        for(int i=0; i < progresses.length ; i++) {
            days[i] = (int)Math.ceil((double)progresses[i]/(double)speeds[i]);
        }


        return days;
    }
}