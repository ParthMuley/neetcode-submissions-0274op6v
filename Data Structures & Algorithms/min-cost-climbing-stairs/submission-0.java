class Solution {
    public int mincost(int[] cost, int min, int[] dp, int n){
        if(n==0 || n==1){
            return 0;
        }
        if(dp[n]!=-1)return dp[n];
        int first=mincost(cost, min, dp, n-1)+cost[n-1];
        int second=Integer.MAX_VALUE;
        if(n>1){
            second=mincost(cost, min, dp, n-2)+cost[n-2];
        }
        return dp[n]=Math.min(first,second);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int min=Integer.MAX_VALUE;
        return mincost(cost, min, dp, cost.length);
    }
}
