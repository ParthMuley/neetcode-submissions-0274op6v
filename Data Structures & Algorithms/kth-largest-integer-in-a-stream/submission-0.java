class KthLargest {
    PriorityQueue<Integer> min;
    int size;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        size=0;
        min=new PriorityQueue<>();
        for(int i:nums){
            min.add(i);
            size++;
            if(size>k){
                min.poll();
            }
        }
    }
    
    public int add(int val) {
        min.add(val);
        size++;
        if(size>k){
            min.poll();
        }
        return min.peek();
    }
}
