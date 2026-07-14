class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> min = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);

        if (lists.length == 0) return dummy.next;

        for (int i = 0; i < lists.length; i++) {  // ✅ < not <=
            ListNode temp = lists[i];
            while (temp != null) {
                min.add(temp);
                temp = temp.next;
            }
        }

        ListNode curr = dummy;                     // ✅ curr starts at dummy
        while (!min.isEmpty()) {
            curr.next = min.poll();
            curr = curr.next;
        }
        curr.next = null;                          // ✅ terminate the list

        return dummy.next;
    }
}