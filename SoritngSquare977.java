package leetcode;

import java.util.Arrays;

public class SoritngSquare977 {
    public int[] sortedSquares(int[] nums) {
        int [] square = new int [nums.length];
        // squaring all
        for ( int i = 0; i < nums.length; i++ ){
            square[i] = (int) Math.pow( nums[i],2);
        }

        // then sorting them again
        Arrays.sort(square);
     return square;
    }
}
