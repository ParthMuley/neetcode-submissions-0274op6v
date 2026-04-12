class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sct=new Stack<>();
        for(String c: tokens){
            if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
                int a=sct.pop();
                int b=sct.pop();
                if(c.equals("+")){
                  sct.push(a+b); 
                }
                else if(c.equals("-")){
                    sct.push(b-a);
                }
                else if(c.equals("*")){
                    sct.push(a*b);
                }else{
                    sct.push(b/a);
                }
            }else{
                sct.push(Integer.parseInt(c));
            }
        }
        return sct.pop();
    }
}
