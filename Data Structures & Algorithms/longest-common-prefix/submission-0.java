class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(String q:strs){
            while(!q.startsWith(s)){
                s=s.substring(0,s.length()-1);
                if(s.isEmpty()){
                    return "";
                }
            }
            continue;
        }
        return s;
    }
}