public class ReverseStringPrefix {
    // Q1. Reverse String Prefix©leetcode
    // https://leetcode.com/contest/biweekly-contest-173/problems/reverse-string-prefix/
    public static void main(String[] args) {
        String s = "Tanmay";
        int k = 5;

        System.out.println(reversePrefix(s, k));
    }

    public static String reversePrefix(String s, int k) {
        char[] ch = s.toCharArray();

        int i = 0 ;
        int j = k - 1; 

        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j] ;
            ch[j] = temp ; 
            i++;
            j--;
        }

        return String.valueOf(ch);
    }
}
