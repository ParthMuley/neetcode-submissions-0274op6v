class Solution {
    public int robry(int[] dp, int[] nums, int n, int max){
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        int robCurrent = nums[n] + robry(dp, nums, n - 2, max);
        int skipCurrent = robry(dp, nums, n - 1, max);
        return dp[n] = Math.max(robCurrent, skipCurrent);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robry(dp, nums, nums.length - 1, 0);
    }
}
