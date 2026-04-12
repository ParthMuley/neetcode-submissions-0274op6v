class MinStack {
    private Stack<Integer> sc;
    List<Integer> ls=new ArrayList<>();

    public MinStack() {
        sc=new Stack<>(); 
    }
    
    public void push(int val) {
        sc.push(val);
        ls.add(val);
    }
    
    public void pop() {
        int q=sc.pop();
        ls.remove(Integer.valueOf(q));
        
    }
    
    public int top() {
        return sc.peek();
    }
    
    public int getMin() {
        Collections.sort(ls);
        return ls.get(0);
    }
}
