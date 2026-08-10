class Solution {
    public int climbing(int[] dp, int n){
        if(n==0)return 1;
        if(dp[n]!=0)return dp[n];
        int firstStep=climbing(dp,n-1);
        int secondStep=0;
        if(n>1)secondStep=climbing(dp,n-2);
        return dp[n]=firstStep+secondStep;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climbing(dp,n);
    }
}
