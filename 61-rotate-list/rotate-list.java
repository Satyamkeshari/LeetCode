
class Solution {
    public int findlength(ListNode root){
        int count = 0;
        ListNode temp = root;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n = findlength(head);
        k= k%n;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast =  head;
        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a = slow.next;
        slow.next=null;
        ListNode temp = a;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return a;
    }
}