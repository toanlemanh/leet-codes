package leetcode;

public class ReverseWords557 {
    public static String reverseWords(String s) {

       String [] words = s.split(" ");
       StringBuilder result = new StringBuilder();
       for (String word : words){
            result.append(" "+reverseString(word.toCharArray()) );
       }
      return result.toString().trim();

    }

    public static String reverseString (char [] s){
        for (int i = 0; i < s.length/2; i++){
            char temp = s [i];
            s [i] = s [s.length - 1 - i];
            s [s.length - 1 - i] = temp;
        }
        String str = new String(s);
        return str;
    }

    public static void main(String[] args) {
         String s = "Let's play";
        System.out.println(  reverseWords(s));

    }
}
