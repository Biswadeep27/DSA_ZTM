package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class CombinationOfSumsFour {

    public static HashMap<Integer, Integer> memo;

    public static int combinationSum4TD(int[] nums, int target){
        memo = new HashMap<>();
        Arrays.sort(nums);
        return combs(nums,target);
    }

    public static int combs(int[] nums, int remain){
        if (remain == 0){
            return 1;
        }

        if (memo.containsKey(remain)){
            return memo.get(remain);
        }
        int result = 0;
        for (int num : nums){
            if (remain - num >= 0){
                result += combs(nums, remain - num);
            }
            else
                break;
        }
        memo.put(remain,result);
        return result;
    }

    public static int combinationSum4BU(int[] nums, int target){

        Arrays.sort(nums);
        int[] dp = new int[target+1];
        dp[0] = 1;

        for (int combSum = 1; combSum < target +1; ++combSum){
            for (int num : nums){
                if (combSum - num >= 0){
                    dp[combSum] += dp[combSum - num];
                }
            }
        }

        return dp[target];
    }

    public static void main(String args[]){
        int[] nums = {1,2,3};
        int target = 4;

        System.out.println("Number of possible combination using top-down approach : " + (combinationSum4TD(nums,target)));
        System.out.println("Number of possible combination using bottom-up approach : " + (combinationSum4BU(nums,target)));
    }
}
