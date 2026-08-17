class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hm=new HashMap<>();
        Node dummy=new Node(0);
        Node copy=dummy;
        Node temp=head;
        while(temp!=null){
            hm.put(temp, new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node nd=hm.get(temp);
            nd.next=hm.get(temp.next);
            nd.random=hm.get(temp.random);
            copy.next=nd;
            copy=copy.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}