class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        Stack<ArrayList<Integer>> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            if(st.isEmpty()){
                st.push(new ArrayList<>(Arrays.asList(i,heights[i])));
            }else{
                if(st.peek().get(1)<=heights[i]){
                    st.push(new ArrayList<>(Arrays.asList(i,heights[i])));
                }else{
                    int q=0;
                    while(!st.isEmpty() && st.peek().get(1)>heights[i]){
                        q=st.peek().get(0);
                        max=Math.max(max,st.peek().get(1)*(i-q));
                        st.pop();
                    }
                    st.push(new ArrayList<>(Arrays.asList(q,heights[i])));
                }
            }
        }
        while(!st.isEmpty()){
            max=Math.max(max, st.peek().get(1)*(heights.length - st.peek().get(0)));
            st.pop();
        }
        return max;

    }
}
