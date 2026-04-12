class Solution {
    public boolean isValid(String s) {
        Stack<Character> opening=new Stack<>();
        if (s.length()==1)return false;
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                opening.push(c);
            }else{
                if(opening.size()==0){
                    return false;
                }
                char t=opening.pop();
                if(t=='{' && c=='}' || t=='(' && c==')' || t=='[' && c==']' ){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(opening.size()!=0)return false;
        return true;
        
    }
}
