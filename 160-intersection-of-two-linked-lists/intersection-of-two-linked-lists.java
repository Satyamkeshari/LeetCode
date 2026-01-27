
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a==null && b==null) return  null;

        ListNode temp1 = a;
        ListNode temp2 = b;
        while(temp1!=temp2){
            temp1=(temp1==null)?b:temp1.next;
            temp2 = (temp2==null)?a:temp2.next;
        }
        return temp1;
    }
}