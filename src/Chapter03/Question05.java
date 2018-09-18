package Chapter03;

public class Question05 {

    public static int binSearch(int[] a, int n , int key) {

        int start = 0;
        int end = n-1;
        int resultIndex = Integer.MAX_VALUE;

        do {

            int middle = (start + end) /2;

            if(a[middle] == key) {
                if(middle < resultIndex) {
                    resultIndex = middle;
                    end = middle -1;
                }
//                return middle;
            } else if(a[middle] < key) {
                start = middle +1;
            } else {
                end = middle -1;
            }


        }while(start <= end);


        return resultIndex;
    }
    public static void main(String[] args) {

        int num = 7;
        int[] nums = new int[]{1,3,5,7,7,7,7,8,8,9,9};

        int result = binSearch(nums, nums.length , num);

        if(result == -1) {
            System.out.println(" 값이 없다.");
        } else {
            System.out.println(num + " 값은 " + result + " 위치에 있다.");
        }

    }
}
