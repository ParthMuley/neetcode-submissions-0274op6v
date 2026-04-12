class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
for (char c : s.toCharArray()) {
    count[c - 'a']++;
}
// Convert array to a unique string key
StringBuilder sb = new StringBuilder();
for (int i : count) {
    sb.append('#').append(i);
}
String key = sb.toString();
            mp.computeIfAbsent(key, k-> new ArrayList<String>()).add(s);
        }
        // Instead of a loop to build the list:
return new ArrayList<>(mp.values());
    }
}