// Given an integer array:: nums
// return all the triplets:: [nums[i], nums[j], nums[k]]

//  where:: nums[i] + nums[j] + nums[k] == 0
//  indices:: i, j and k are all distinct.

// The output should not contain any:: duplicate triplets
// You may return the output and the triplets in any order.


// what we can do is fix i in for loop and have j and k as value j=i+1 and k=nums.length and make a two sum question out of it

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1; 
            int k = nums.length - 1; 
            int target = -nums[i];
            while (j < k) {
                int currentSum = nums[j] + nums[k];
                if (currentSum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    
                } else if (currentSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return result;
    }
}
