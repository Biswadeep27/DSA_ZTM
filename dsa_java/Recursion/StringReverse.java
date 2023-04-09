package Recursion;

import java.util.stream.IntStream;

public class StringReverse {
    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    public static void main(String args[]){
       char[] ip_s = {'H','a','n','n','a','h'};
        reverseString(ip_s);
        System.out.println("Reverse of the string: ");
        IntStream.range(0,ip_s.length).mapToObj(i -> ip_s[i]).forEach(ch->System.out.print(ch + " "));

    }
}
