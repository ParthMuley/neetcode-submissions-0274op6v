class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] hash=new int[256];
        int startIndex=-1;
        int count=0;
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        int left=0;
        int right=0;
        while(right<s.length()){
            if(hash[s.charAt(right)]>0){
                count++;
            }
            hash[s.charAt(right)]--;
            while(count==t.length()){
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    count--;
                }
                left++;
            }
                
                right++;
            }
            return (startIndex==-1)?"":s.substring(startIndex, startIndex+minLength);
        }
        
    }

