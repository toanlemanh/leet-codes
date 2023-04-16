package leetcode;

public class SearchInsert035 {


    // O(log(n))
    //Given a sorted array of distinct integers and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.
    // You must write an algorithm with O(log n) runtime complexity.
//        public static int searchInsert(int[] nums, int target) {
//                for ( int i = nums.length-1; i >= 0; i--){
//                    if (nums [i] == target)
//                        return i;
//                }
//                // if not
//                // compare
//                for ( int i = nums.length-1; i >= 0; i--){
//                    if ( nums[i] < target)
//                        return i+1;
//                }
//                return 0;
//
//            }

    public static int searchInsert(int[] nums, int target) {
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

    public static void main(String[] args) {
        int [] arr = {0,1,2,4,7,8,9};
        int x = searchInsert(arr,10);
        System.out.println(x);
    }
}


