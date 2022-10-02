package LeetCodeProblems;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;

public class numDecodings {

    static Map<Integer, Integer> memo = new HashMap<>();

    public static int getNumDecodings(String s){
        return recursiveWithMemo(0, s);

    }

    public static int recursiveWithMemo(int index, String s){
        if (memo.containsKey(index)){
            return memo.get(index);
        }
        if (index == s.length()){
            return 1;
        }
        if (s.charAt(index) == '0'){
            return 0;
        }
        if (index == s.length() -1){
            return 1;
        }

        int ans = recursiveWithMemo(index + 1, s);
        if (Integer.parseInt(s.substring(index,index +2)) <= 26){
            ans += recursiveWithMemo(index + 2, s);
        }
        memo.put(index, ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "1211";
        int ans = getNumDecodings(s);

        System.out.println("The number of ways " + (ans));
    }

}
