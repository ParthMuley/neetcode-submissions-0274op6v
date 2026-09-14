class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        prev = null;
        next = null;
    }
}

class LRUCache {

    Map<Integer, Node> hashMap = new HashMap<>();
    int cap;
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (!hashMap.containsKey(key)) return -1;

        Node x = hashMap.get(key);
        remove(x);
        insertFront(x);
        return x.val;
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            Node x = hashMap.get(key);
            x.val = value;
            remove(x);
            insertFront(x);
        } else {
            if (hashMap.size() == cap) {
                Node lru = tail.prev;
                remove(lru);
                hashMap.remove(lru.key);
            }
            Node x = new Node(key, value);
            hashMap.put(key, x);
            insertFront(x);
        }
    }
}