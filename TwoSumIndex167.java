package leetcode;

import java.util.Arrays;

public class TwoSumIndex167 {
    public static int [] twoSum(int[] numbers, int target) {

        int left = 0; int right = numbers.length - 1;

        while (numbers [left] + numbers [right]  != target ) {
            if ( numbers [left] + numbers [right] < target )
                left++;
            else //   if ( numbers [left] + numbers [right] > target )
               right--;
        }
        return new int []{ left+1, right+1 };
    }

    public static void main(String[] args) {
//        int [] a = { 0,3,5,6,7,9,11,14,15};
//        int [] a  = {-1,0};
       int a [] = {-3,3,4,90};
        System.out.println(Arrays.toString(twoSum(a,0)));

    }
}
