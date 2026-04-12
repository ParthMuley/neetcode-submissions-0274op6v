// You are given a string :: s 
// following characters: '(', ')', '{', '}', '[' and ']'

// The input string s is valid if and only if:
//     Every open bracket is closed by the same type of close bracket.
//     Open brackets are closed in the correct order.
//     Every close bracket has a corresponding open bracket of the same type.

// Return true if s is a valid string, and false otherwise.

// 1 <= s.length <= 1000

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')   {
                sc.push(s.charAt(i));
            }
            else{
                if (sc.isEmpty()){
                    return false;
                }
                char q=sc.pop();
                if(s.charAt(i) == '}' && q!='{'){
                    return false;
                }
                else if(s.charAt(i) == ')' && q!='('){
                    return false;
                }
                else if(s.charAt(i) == ']' && q!='['){
                    return false;
                }
            }
        }
        return sc.isEmpty();
    }
}
