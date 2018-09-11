package Chapter01;

/*
    8. 1부터 10까지의 합은 (1+10) 5 와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을 이용하여
        1부터 n 까지의 정수 합을 구하는 프로그램을 작성하셈!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {
    public static void main(String[] arags) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum =0;

        // 짝,홀의 경우를 따로 생각해주어야 한다.
        for(int i=1; i <= n / 2 ; i++) {
            sum += i + (n+1) -i;
            if(n % 2 ==1 && i == n/2) {
                sum += (n+1)/2;
            }

        }
        System.out.println("합계는 ? " + sum);
    }
}
