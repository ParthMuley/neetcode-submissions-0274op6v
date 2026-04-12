// given:: string s--> have uppercase english character
//         integer k--> you can choose up to k character of the string 
//                     and replace them with any other upper ccase English character


// what to do After performing at most k replacements
// return the length of ther longest substring which contains only one ::: distinct character

// constraints: 1 <= s.length <= 1000
//              0 <= k <= s.length  

// what should we do :::
//     SLinding Window : is it because it is a subtring questing 
//                     :: we have to find the longest substring with same char
        // what to do to find the longest substring with same char so check if we change at most k from that 
        // we move from index 0 and start moving if we find a char which is same we move l to the left
        // and if not we should check for k index left to it if we dont find the same we increment r by one sound right  


class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int maxLen = 0;
        int maxFreq = 0;
        int[] charCounts = new int[26];
        for (int right = 0; right < s.length(); right++) {
            int charIndex = s.charAt(right) - 'A';
            charCounts[charIndex]++;
            maxFreq = Math.max(maxFreq, charCounts[charIndex]);
            int windowSize = right - left + 1;
            int replacementsNeeded = windowSize - maxFreq;
            while (replacementsNeeded > k) {
                charCounts[s.charAt(left) - 'A']--;
                left++;
                windowSize = right - left + 1;
                replacementsNeeded = windowSize - maxFreq;
            }
            maxLen = Math.max(maxLen, windowSize);
        }
        
        return maxLen;
    }
}