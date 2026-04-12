// given:: String s
// find:: the length of the longest substring without duplicate char.
// constraints::0 <= s.length <= 1000
// s may consist of printable ASCII characters.

// what is a substring::
// A substring is a contiguous sequence of characters within a string.


// eg:   input:"zxyzxyz"
// out:3 as it has zxy which has no duplicate char.

// how to know if it was there or not we have to use sliding window here but how????
// index i start from z move forward check if next char already seen before that is it duplicatte how to check?/?
//maybe hashset..


class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int min=0;
        int r=0;
        int l=0;
        while(r<s.length() && l<s.length()){
            if(!st.contains(s.charAt(l))){
                st.add(s.charAt(l));
                l++;
                min=Math.max(l-r,min);
            }else{
                st.clear();
                r++;
                l=r;
            }
        }
        return min;
    }
}
