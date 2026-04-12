// You are given 
// an array of strings tokens that represents a valid arithmetic expression in
//  Reverse Polish Notation.->
// eg- 3 4 + = 3+4


// Return the integer that represents the evaluation of the expression.

// The operands may be integers or the results of other operations.
// The operators include '+', '-', '*', and '/'.
// Assume that division between integers always truncates toward zero.


// 1 <= tokens.length <= 1000

// tokens[i] is "+", "-", "*", or "/", or a string representing an integer in the range [-100, 100].


class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")|| tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int q=sc.pop();
                int g=sc.pop();
                if(tokens[i].equals("+")){
                    int sum=q+g;
                    sc.push(sum);
                }
                else if(tokens[i].equals("-")){
                    int sum=g-q;
                    sc.push(sum);
                }
                else if(tokens[i].equals("*")){
                    int sum=q*g;
                    sc.push(sum);
                }
                else{
                    int sum=g/q;
                    sc.push(sum);
                }
            }
            else{
                sc.push(Integer.parseInt(tokens[i]));
            }
        }
        return sc.peek();
    }
}
