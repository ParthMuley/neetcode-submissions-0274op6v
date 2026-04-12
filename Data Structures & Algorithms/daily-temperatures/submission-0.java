// array of integers temperatures
// temperatures[i] represents the daily temperatures on the ith day.
// Return an array result where result[i] is the number of days after the ith day
// before a warmer temperature appears on a future day

//  If there is no day in the future where a warmer temperature will appear for the ith day
//  , set result[i] to 0 instead.

// given array temperature
// what to find the next warmer day in the arrray

// how to do that 
//     --using stack but what to do in stack??
//     two pointer better approch
//     i=0 and j=i+1 till j reach temp.length() and if doesn't find something until then make temp[i]=0 and move i by1
    





class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        for(int i=0;i<temperatures.length;i++){
            int j=i+1;
            while(j<temperatures.length){
                if(temperatures[j]>temperatures[i]){
                    temperatures[i]=j-i;
                    break;
                }
                else{
                    if(j==temperatures.length-1){
                        temperatures[i]=0;
                    }
                    j++;
                }
            }
        }
        temperatures[temperatures.length-1]=0;
        return temperatures;
    }
}
