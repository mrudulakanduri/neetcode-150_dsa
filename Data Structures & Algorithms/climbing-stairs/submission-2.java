class Solution {
    int[] dp;

    public int climbStairs(int n) {
        if (dp == null) {
            dp = new int[n + 1];  // initialize only once
        }
        if (n == 0) return 1;
        if (n < 0)  return 0;
        if (dp[n] != 0) return dp[n];

        dp[n] = climbStairs(n - 1) + climbStairs(n - 2) ;
        return dp[n];
    }
}