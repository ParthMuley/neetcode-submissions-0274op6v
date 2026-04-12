class Node{
    int data;
    int value;
    Node next;
    public Node(){
        data=-1;
        value=Integer.MAX_VALUE;
        next=null;
    }
    public Node(int data, int val, Node next){
        this.data=data;
        this.value=val;
        this.next=next;
    }
}


class MinStack {
    private Node head;

    public MinStack() {
        head=new Node();
    }
    
    public void push(int val) {
        Node node=new Node(val,val,null);
        node.next=head;
        node.value=(head.value< node.value)?head.value:node.value;
        head=node;        
    }
    
    public void pop() {
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    
    public int top() {
        return head.data;
        
    }
    
    public int getMin() {
        return head.value;
    }
}
