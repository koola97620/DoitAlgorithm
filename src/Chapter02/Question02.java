package Chapter02;

/*
    2.오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.!
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question02 {
    public static void main(String[] args ) {
        String str1 = "algorithm";
        String str2 = "allergy";

        List<String> list = new ArrayList<String>();

        list.add(str1);
        list.add(str2);

        Collections.sort(list);

        System.out.println(list);


    }
}
