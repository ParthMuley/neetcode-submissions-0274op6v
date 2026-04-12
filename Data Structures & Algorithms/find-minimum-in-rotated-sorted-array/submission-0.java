class Solution {
    public int findMin(int[] nums) {
        int n=1000;
        for(int i:nums){
            n=Math.min(n,i);
        }
        return n;
    }
}
