class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. Create a sentinel/dummy node to act as the start
        ListNode dummy = new ListNode(0);
        // 2. 'current' will move as we add nodes, 'dummy' stays put
        ListNode current = dummy;

        // 3. Only loop while BOTH lists have nodes to compare
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // 4. If one list is exhausted, attach the remainder of the other
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // 5. The merged list starts AFTER the dummy node
        return dummy.next;
    }
}