class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode ld = new ListNode(0);
        ListNode rd = new ListNode(0);
        ListNode left = ld ;
        ListNode right = rd ;

        while(head != null){
            if (head.val < x){
                left.next = head;
                left = left.next;
            }
            else {
                right.next = head;
                right = right.next;
            }
        head = head.next;
        }
        right.next = null;
        left.next = rd.next;
        return ld.next;
    }
}