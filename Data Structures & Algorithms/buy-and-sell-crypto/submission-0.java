// You are given an integer array ::prices:: where 
// prices[i] is the price of NeetCoin on the ith day.

// You may choose a single day to buy:: one NeetCoin and choose a:: different:: day in the future to sell
//  it.
// Return the ::maximum profit:: you can achieve.
//  You may choose to not make any transactions, in which case the profit would be ::0::.


//  move it from start to find the min once it get we change value if a lesser one is found something
//   which is greater it sell 

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else{
               profit= Math.max(profit,prices[i]-min);
            }
        }
        return profit;
    }
}
