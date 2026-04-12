// Given an array of integers numbers that is sorted in 
// non-decreasing order.
// Return the indices (1-indexed) of two numbers: [index1, index2]

// such that they add up to a given target number: target
// index1 < index2
// index1 and index2 cannot be equal, therefore you may not use the same element twice.

//  exactly one valid solution.
// use 
// O(1) additional space.

// 2 <= numbers.length <= 1000
// -1000 <= numbers[i] <= 1000
// -1000 <= target <= 1000

// target=number[index1]+number[index2]

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
