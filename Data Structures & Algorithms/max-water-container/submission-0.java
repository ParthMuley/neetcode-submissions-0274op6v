// You are given an integer array:: heights
//  heights[i] represents ::the height of the i th bar.

// You may choose any ::two bars:: to form a container

// Return :: the maximum amount of water a container can store.

// index differences:l 
// value of element :b :lowest of the two

// 2 <= height.length <= 1000
// 0 <= height[i] <= 1000


// example
// height = [1,7,2,5,4,7,3,6]

// Output: 36

// min(7,6)*(indx:7 and indx:6)=6*(1-7)=6*6=36


class Solution {
    public int maxArea(int[] heights) {
        int area=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            area=Math.max((Math.min(heights[i],heights[j])*(j-i)),area);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return area;
    }
}
