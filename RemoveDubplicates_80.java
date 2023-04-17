package leetcode;

public class RemoveDubplicates_80 {
    private static int removeDuplicates (int [] array){
        int currentIndex = 0;
        int len = array.length;
        for (int i = 0; i < len; i++){
            if (array[currentIndex] != array[i]){
                currentIndex++;
                array[currentIndex] = array[i];
            }
        }
        return currentIndex + 1;
    }
    public static void main(String[] args) {
        int [] sortedArray = {0,0,0,0,1,1,3,3,6,6,6,9};
        System.out.println(removeDuplicates(sortedArray));

    }
}
