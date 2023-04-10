package LeetCode;
import java.util.Scanner;
public class StringToInteger_8 {
//    Bao quat het tat ca cac truong hop dau vao \
//    Neu nguoi dung khong nhap gi ?
//    Neu nguoi dung nhap qua dai
//    Meu nguoi dung nhap lin tinh, sai kieu du lieu ?
//    Neu nguoi dung nhap sai cu phap =>
    public static int myAtoi(String s) {

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
//
        s = s.trim();

//        detect the non-digit at the end of string
        for (int i = 0; i < s.length(); i++){
            for (char c = 'A'; c <= 'z'; c++){
                    if (s.charAt(i) == c){
                        s = s.substring(0,i);
                        break;
                }
            }
        }

        int num = Integer.valueOf(s);
        if (num >= min && num <= max) {
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(myAtoi(str));

    }
}
