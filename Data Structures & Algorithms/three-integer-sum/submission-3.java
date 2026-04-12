class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            else if(i>0&& nums[i]==nums[i-1]){
                continue;
            }
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
            if (0==nums[i]+nums[low]+nums[high]){
                List<Integer> ls1=new ArrayList<>();
                ls1.add(nums[i]);
                ls1.add(nums[low]);
                ls1.add(nums[high]);
                ls.add(ls1);
                low+=1;
                high-=1;
                while(low<high && nums[low]==nums[low-1]){
                    low+=1;
                }
                while(low<high && nums[high]==nums[high+1]){
                    high-=1;
                }
            }
            else if(nums[i]+nums[low]+nums[high]>0){
                high-=1;
            }
            else{
                low+=1;
            }
            }

        }
        return ls;

    }
}
