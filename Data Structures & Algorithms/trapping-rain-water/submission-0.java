// You are given an array of non-negative integers height
//  Each value height[i] represents the height of a bar, which has a width of 1.

// Return the maximum area of water that can be trapped between the bars.
// border can't hold water like index 0 and height.length wont have water on them.

// 1 <= height.length <= 1000
// 0 <= height[i] <= 1000





class Solution {
    public int trap(int[] height) {
        int total=0;int lMax=0;int rMax=0;int lIndex=0;int rIndex=height.length-1;
        while(lIndex<rIndex){
            if(height[lIndex]<=height[rIndex]){
                if(lMax>height[lIndex]){
                    total+=lMax-height[lIndex];
                }else{
                    lMax=height[lIndex];
                }
                lIndex++;
            }
            else{
                if(rMax>height[rIndex]){
                    total+=rMax-height[rIndex];
                }
                else{
                    rMax=height[rIndex];
                }
                rIndex--;
            }
        }
        return total;
    }
}
