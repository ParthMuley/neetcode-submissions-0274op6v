class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }

        int longest=0;
        for(int i:nums){
            if(!st.contains(i-1)){

                int len=1;
                int next=i+1;
                while(st.contains(next)){
                    len++;
                    next++;
                }
                longest=Math.max(longest, len);
            }
        }
        return longest;
    }
}
