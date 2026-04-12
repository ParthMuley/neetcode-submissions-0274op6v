class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];
        int val=-1;int count=0;
        for(int i:nums){
            if(count==0){
                val=i;
                count++;
            }
            else if(i==val){
                count++;
            }
            else{
                count--;
            }
        }
        return val;
    }
}