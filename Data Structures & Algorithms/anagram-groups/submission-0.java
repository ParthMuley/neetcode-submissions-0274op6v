class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<>();
        for(String s: strs){
            char[] q=s.toCharArray();
            Arrays.sort(q);
            String t=new String(q);
            mp.computeIfAbsent(t, k-> new ArrayList<String>()).add(s);
        }
        List<List<String>> output=new ArrayList<>();
        for(String z: mp.keySet()){
            output.add(mp.get(z));
        }
        return output;
    }
}