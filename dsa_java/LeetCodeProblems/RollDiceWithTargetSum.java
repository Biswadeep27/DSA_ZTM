package LeetCodeProblems;

public class RollDiceWithTargetSum {
    final static int MOD = 1000000007;

    static int waysToTarget(Integer[][] memo, int currIndex, int currSum, int n, int k, int target){
        if (currIndex == n){
            return currSum == target? 1:0;
        }
        if (memo[currIndex][currSum] != null){
            return memo[currIndex][currSum];
        }
        int ways = 0;
        for(int i=1; i <= Math.min(k, target - currSum); i++){
            ways = (ways + waysToTarget(memo, currIndex + 1, currSum + i, n, k, target)) % MOD;
        }

        return memo[currIndex][currSum] = ways;
    }

    public static void main(String[] args){
        int n =  2;
        int k =  6;
        int target = 7;
        Integer[][] memo = new Integer[n+1][target+1];
        System.out.println("Number of ways: " +
                (waysToTarget(memo, 0, 0, n, k, target)));
    }
}
