package leetcode;

import java.util.Arrays;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++){
            char temp = s [i];
            s [i] = s [s.length - 1 - i];
            s [s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','0'};
        reverseString(s);
        System.out.println(Arrays.toString(s) );
    }
}
