package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Homework1  {

    public static int compareTo(char[] sa, char[] sb)
    {
        int result =0;

        if (sa.length >= sb.length) {
            for(int i=0 ; i < sb.length ; i++) {
                if(sa[i] > sb[i] ) {
                    result = 1;
                    break;
                }else if(sa[i]==sb[i]) {
                    result = 0;
                    continue;
                }else {
                    result = -1;
                    break;
                }
            }
        } else {
            for(int i=0 ; i < sa.length ; i++) {
                if(sa[i] > sb[i] ) {
                    result = 1;
                }else if(sa[i]==sb[i]) {
                    result = 0;
                    continue;
                }else {
                    result = -1;
                }
            }

        }

        if(result == 0) {
            if(sa.length > sb.length) {
                result = 1;
            } else if(sa.length < sb.length) {
                result = -1;
            }

        }
        return result;
    }
    // 사전순으로 정렬
    public static void sort(String str1, String str2) {

        List<String> list = new ArrayList<String>();

        list.add(str1);
        list.add(str2);

        Collections.sort(list);

        if(list.get(0).equals(str1)) {
            System.out.println(-1);
        }else if( list.get(0).equals(str2) ) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sa = scanner.next().toCharArray();
        char[] sb = scanner.next().toCharArray();
        int result = compareTo(sa, sb);
        if(result < 0){
            System.out.println(-1);
        }else if(result > 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        String str1 = new String(sa);
        String str2 = new String(sb);

        sort(str1,str2);

    }

}
