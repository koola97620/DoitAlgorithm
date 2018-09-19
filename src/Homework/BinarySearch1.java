package Homework;

public class BinarySearch1 {

    public static int binarySearch(int[] nums , int number) {

        int start = 0;
        int end = nums.length -1;

        do {
            int middle = (start + end)/2;

            if(nums[middle] == number)  {
                return middle;
            }

            if(nums[middle] < number) {
                start = middle + 1;
            } else if(nums[middle] > number) {
                end = middle - 1;
            }

        }while(start <= end );

        return -1;

    }

    public static void main(String[] args) {
        // 찾는 수.
        int number = 5;

        int[] nums = new int[]{1,5,7,9,10,11};

        int idx =binarySearch(nums, number);

        if(idx == -1) {
            System.out.println("값 없음! ");
        } else {
            System.out.println("값이  " + idx + " 번째 있습니다. ");
        }

        String s = "1";
        if(s.charAt(0) == 1) {
            System.out.println("dd");
        }


    }
}
