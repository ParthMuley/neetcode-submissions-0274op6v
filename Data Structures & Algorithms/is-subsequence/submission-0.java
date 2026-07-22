class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;  

        Queue<Character> que = new LinkedList<>();
        for (char c : s.toCharArray()) que.offer(c);

        for (char c : t.toCharArray()) {
            if (que.peek() == c) {   
                que.poll();
            }
            if (que.isEmpty()) return true;
        }
        return false;
    }
}