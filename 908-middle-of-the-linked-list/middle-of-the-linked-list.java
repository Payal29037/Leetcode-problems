class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode x1 = head;
        ListNode x2 = head; 
        while( x2 != null && x2.next != null){
            x1 = x1.next;
            x2 = x2.next.next;
        }
     return x1;
        
    }
}