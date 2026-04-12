class MyQueue {
    private Stack<Integer> sc1;
    private Stack<Integer> sc2=new Stack<>();

    public MyQueue() {
        sc1=new Stack<>();
    }
    
    public void push(int x) {
        while(!sc1.isEmpty()){
         sc2.push(sc1.pop());   
        }
        sc1.push(x);
        while(!sc2.isEmpty()){
            sc1.push(sc2.pop());
        }
        
    }
    
    public int pop() {
        return sc1.pop();
        
    }
    
    public int peek() {
        return sc1.peek();
    }
    
    public boolean empty() {
        return sc1.isEmpty();       
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */