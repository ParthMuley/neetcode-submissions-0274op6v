class Solution {
    public int appendCharacters(String s, String t) {
        Queue<Character> que=new LinkedList<>();
        for(char c:t.toCharArray()){
            que.offer(c);
        }
        for(char c:s.toCharArray()){
            if(que.peek()==c){
                que.poll();
            }
            if(que.isEmpty()){
                return 0;
            }
        }
        return que.size();
    }
}