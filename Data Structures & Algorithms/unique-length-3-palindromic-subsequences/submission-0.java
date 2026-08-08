class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        int[] first=new int[26];
        java.util.Arrays.fill(first,-1);
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            int charAt=s.charAt(i)-'a';
            if(first[charAt]==-1){
                first[charAt]=i;
            }last[charAt]=i;
        }
        for(int i=0;i<26;i++){
            if(first[i]!=-1&&last[i]>first[i]+1){
                Set<Character> st=new HashSet<>();
                for(int q=first[i]+1;q<last[i];q++){
                    st.add(s.charAt(q));
                }
                count+=st.size();
            }
        }
        return count;
    }
}