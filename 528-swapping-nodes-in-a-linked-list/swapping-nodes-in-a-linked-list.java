
class Solution {
    public ListNode swapNodes(ListNode head, int n) {

       ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast = head;
        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        
    return head;

    }
}