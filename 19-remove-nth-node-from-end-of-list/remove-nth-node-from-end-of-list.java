
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
       
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            return head.next;
        }
        int idx = (len-n);
        temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}