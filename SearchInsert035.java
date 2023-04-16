package leetcode;

public class SearchInsert035 {
    
        public int searchInsert(int[] nums, int target) {
            int left = 0; int right = nums.length - 1;
         while ( left <= right ){
             int mid = (left + right) / 2;  // để tránh
             if ( nums[mid] == target )
                 return mid;
             else if ( nums[mid] < target )
                 left = mid + 1;
             else
                 right = mid - 1;
         }
         return left;

        }
    
}
