class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int min=1;
        int cur=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                cur++;
                min=Math.max(min,cur);
            }
            else{
                cur=1;
            }
        }
        return min;
    }
}
