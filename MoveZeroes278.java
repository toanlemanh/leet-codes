package leetcode;

public class MoveZeroes278 {
//    private static void swap (int [] array,int i ,int j){
//        int temp =
//    }

    private static void moveZeroes1 (int [] array){
//        in-place technique
        int i = 0;
        int j = 0;
        int n = array.length;
        while (j < n){
            if ( array[j] != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
            j++;
        }
    }

    private static void moveZeroes2 (int [] array){
//      Cachs 2 sau khi dua cac phan tu khac 0 len dau mang thi cho tat ca cac phan tu con lai = 0
        int curIndex = 0; // index sau khi xep
        int n = array.length;
         // i bien chay
        for (int i = 0; i < n; i++){
            if ( array[i] != 0) {
                array[curIndex] = array[i];
                curIndex++;
            }
        }
        for (; curIndex < n; curIndex++ ){
            array[curIndex] = 0;
        }

    }
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    public static void main(String[] args) {
        int [] array = {0,0,12,0,0,3,4,0};
//        moveZeroes1 (array);
        moveZeroes2 (array);
        for (int i : array){
            System.out.print(i+" ");
        }
    }
}
