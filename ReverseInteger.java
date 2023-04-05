package leetcode;

import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469; // 153
//        int x = 123;
        System.out.println( reverse(x) );
      //  System.out.println(Integer.MAX_VALUE);
    }
    public static int reverse(int x) {
//        int MIN = -(int) (Math.pow(2,31));
//        int MAX =  (int) (Math.pow(2,31)-1);
        int MIN =  Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;
       // BigInteger X = new BigInteger(x+"");
        if (MIN >= x || x >= MAX)
            return 0;
        else {
            int temp = Math.abs(x);
           int remainder = 0;
            while (temp > 0) {

                remainder = (temp % 10) + remainder * 10;
                temp = temp / 10;
                String str =
                if ( remainder <= MIN || remainder >= MAX)
                    return 0;
            }
            if (x > 0)// x > 0
                return remainder;
            return -remainder; // x < 0
        }
    }
}
