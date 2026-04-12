class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ns=new int[nums.length];
        int pro=1;
        int count=0;
        for(int i:nums){
            if(i!=0){
                pro*=i;
            }
            else{
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (count > 1) { // If there are two or more zeros
                ns[i] = 0;
            } else if (count == 1) { // If there is exactly one zero
                if (nums[i] == 0) {
                    ns[i] = pro; // Result is product of non-zeros
                } else {
                    ns[i] = 0; // Result is zero
                }
            } else { // No zeros
                ns[i] = pro / nums[i];
            }
}
        return ns;
    }
}  
