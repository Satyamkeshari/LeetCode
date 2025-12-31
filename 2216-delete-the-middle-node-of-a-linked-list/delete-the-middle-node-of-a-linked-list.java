
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next==null){
            return head.next;
        }
        while( fast.next.next!=null&&fast.next.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}