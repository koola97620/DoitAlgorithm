package Chapter07;

public class IntSet {
    private int max;
    private int num;
    private int[] set;

    public IntSet(int capacity) {
        max = capacity;
        num =0;
        try {
            set = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int capacity() {
        return max;
    }
    public int size() {
        return num;
    }


    public int indexOf(int n) {
        for(int i=0; i < num ; i++) {
            if(set[i] == n)
                return i;
        }
        return -1;
    }

    public boolean contains(int n) {
        return (indexOf(n) != -1) ? true : false;
    }

    public boolean add(int n) {
        if(num >= max || contains(n) == true)
            return false;
        else {
            set[num++] = n;
        }
        return true;
    }

    public boolean remove(int n) {
        int idx = indexOf(n);

        if(num <= 0 || idx == -1 )
            return false;
        else {
            set[idx] = set[--num];
            return true;
        }
    }

    // s 에 복사.
    public void copyTo(IntSet s) {
        int n = (s.max < num) ? s.max : num;

        for(int i=0; i < n  ; i++) {
            s.set[i] = set[i];
        }
        s.num = n;
    }


    // s 를 복사.
    public void copyFrom(IntSet s) {
        int n = (max < s.num) ? max : s.num;
        for(int i=0; i < n; i++) {
            set[i] = s.set[i];
        }
        num = n;
    }


    // s와 같은지 확인
    public boolean equalTo(IntSet s) {
        if(num != s.num)
            return false;

        for(int i=0; i < num ; i++) {
            int j=0;
            for( ; j < s.num ; j++) {
                if(set[i] == s.set[j])
                    break;
            }
            if(j == s.num) {
                return false;
            }
        }
        return false;
    }

    // 합집합
    public void unionOf(IntSet s1, IntSet s2) {
        copyFrom(s1);
        for(int i=0; i < s2.num ; i++) {
            add(s2.set[i]);
        }
    }

    // 출력
    public String toString() {
        StringBuffer temp = new StringBuffer("{ ");
        for(int i=0; i < num ; i++) {
            temp.append(set[i] + " ");

        }
        temp.append("}");
        return temp.toString();
    }




    /*
        연습문제1
        isEmpty() , isFull() , clear() 메소드를 추가해라.
     */
    public boolean isEmpty() {
        if(num == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(max == num) {
            return true;
        }
        return false;
    }

    public void clear() {
        // num = 0;

        for(int i=0; i < num ; i++) {
            set[i] = 0;
        }
        num =0;
    }

    /*
        합집합, 교집합, 차집합 구해라.
        (합집합은 union 있지 않나?)
     */

    public boolean retain(IntSet s) {

        int size = size();

        ii:for(int i=0; i < num ; i++) {

            for(int j=0; j < s.num ; j++) {
                if(set[i] == s.set[j]) {
                    continue ii;
                } // 같은게 있으면 this 의 i+1 배열부터 다시 비교 시작.
            }
            System.out.println(set[i] + "을/를 삭제할겡! ");
            set[i] = -2;
        }

        while(this.contains(-2)) {
            remove(-2);
        }

        // 배열 크기가 달라지면 true 리턴.
        if(size != this.size()) {
            return true;
        }
        return false;
    }

    // 차집합.
    public boolean remove(IntSet s) {

        // IntSet temp = this.retain(s);
        // 그냥 다시 해야겠다...

        int size = size();

        ii:for(int i=0; i < num ; i++) {

            for(int j=0; j < s.num ; j++) {
                if(set[i] == s.set[j]) {
                    System.out.println(set[i] + "을/를 삭제할겡! ");
                    set[i] = -2;
                    continue ii;
                } // 같은게 있으면 this 의 i+1 배열부터 다시 비교 시작.
            }

        }

        while(this.contains(-2)) {
            remove(-2);
        }

        // 배열 크기가 달라지면 true 리턴.
        if(size != this.size()) {
            return true;
        }
        return false;
    }



    /*
        연습문제 3.
     */

    // 집합 s의 부분집합인지 확인한다
    public boolean isSubsetOf(IntSet s) {

        int size = size();
        int count = 0;

        ii:for(int i=0; i < num ; i++) {

            if(s.contains(set[i])) {
                count++;
            }
        }

        // count 가 this 의 사이즈와 같으면 s의 부분집합.
        if(size == count) {
            return true;
        }

        return false;
    }


    // 집합 s의 진부분집합인지 확인할꺼야!
    public boolean isProperSubsetOf(IntSet s) {
        int count = 0;

        ii:for(int i=0; i < num ; i++) {

            if(s.contains(set[i])) {
                count++;
            }
        }

        // count 가 s 의 사이즈와 같으면 s의 부분집합.
        if(s.size() != count) {
            return true;
        }

        return false;
    }



    /*
        연습문제4.
     */

    // s1 과 s2의 교집합을 복사합니다.
    public void intersectionOf(IntSet s1, IntSet s2) {
        this.clear();
        for(int i=0; i < s1.num ; i++) {
            if(s2.contains(s1.set[i])) {
                this.add(s1.set[i]);
            }
        }
    }

    // 차집합을 복사할꺼얏!;
    // s1 의 차집합.
    public void differenceOf(IntSet s1, IntSet s2) {
        this.clear();
        for(int i=0; i < s1.num ; i++) {
            if(!s2.contains(s1.set[i])) {
                this.add(s1.set[i]);
            }
        }

    }



}
