package leetcode;

import java.util.Arrays;

public class RemoveElement027 {
    public static void main(String[] args) {
       int [] array = {0,1,2,2,3,0,4,2};
        //        int [] array ={1};
        System.out.println( removeElement(array,2) + " "+ Arrays.toString(array)  );
    }
    public static int removeElement(int[] nums, int val) {
        // swap all the duplicates to the end of array
        int k = 0;
        int j = nums.length - 1;
        int i = 0;

        while ( i <= j ){
            if ( nums[i] == val && nums [j] != val ){
                //swap them
                int temp = nums [i];
                nums [i] = nums [j];
                nums [j] = temp;
                k++;
                i++;
                j--;
            }
            else if ( nums[j] == val){
                j--;
                k++;
            }
            else if (nums[i] != val){
                i++;
            }
        }
        return nums.length - k;

    }

}
