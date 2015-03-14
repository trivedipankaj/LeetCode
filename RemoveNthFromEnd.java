public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode ptr=head,curr=head,prev=null;
        int count=0;
        while(curr!=null){
            count++;
            if(count>n){
                prev=ptr;
                ptr=ptr.next;
            }
            curr=curr.next;
        }
        if(prev==null){
            head =head.next;
        }else if(ptr.next==null){
            prev.next=null;
        }else{
            prev.next=ptr.next;
        }
        
        return head;
    }
}
