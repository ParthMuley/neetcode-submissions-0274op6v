class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i:piles)high=Math.max(high,i);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(hours(piles,mid)<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private int hours(int[] piles, int h){
        int total=0;
        for(int i:piles){
            total+=(i+h-1)/h;
        }
        return total;
    }
}
