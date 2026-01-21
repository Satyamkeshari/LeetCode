
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) {
			 return null;
		 }
		PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
		
		for(ListNode node : lists) {
			if(node!=null) {
				pq.add(node);
			}
		}
		ListNode dummey = new ListNode(-1);
		ListNode temp = dummey;
		while(!pq.isEmpty()) {
			ListNode minnode = pq.poll();
			temp.next=minnode;
			temp=temp.next;
			if(minnode.next!=null) {
				pq.add(minnode.next);
			}
		}
        return dummey.next;
        
    }
}