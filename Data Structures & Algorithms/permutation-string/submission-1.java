// given:: two string s1 and s2.
// Return true if s2 contains a permutation of s1, or false otherwise
//  That means if a permutation of s1 exists as a substring of s2, then return true.
// Both strings only contain lowercase letters.

// constraint:1 <= s1.length, s2.length <= 1000
//window size will always be of size of s1 it will be always be



class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int slidingSize=s1.length();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']+=1;
            arr2[s2.charAt(i)-'a']+=1;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            arr2[s2.charAt(i)-'a']+=1;
            arr2[s2.charAt(i-slidingSize)-'a']-=1;
            if(Arrays.equals(arr1,arr2)){
                return true;
            }

        }
        return false;
    }
}
