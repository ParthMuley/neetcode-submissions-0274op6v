class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            max.add(i);
        }
        while (max.size() > 1) {
            int first = max.poll();
            int second = max.poll(); 
            
            if (first != second) {
                max.add(first - second); 
            }
        }
        
        return max.isEmpty() ? 0 : max.peek();
    }
}
