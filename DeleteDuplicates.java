public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev=null;
        while(temp!=null){
            while(prev!=null && temp!=null && temp.val == prev.val){
                if(temp.next !=null){
                    prev.next = temp.next;
                }else{
                    prev.next=null;
                    return head;
                }
                temp =temp.next;
            }
            prev=temp;
            temp = temp.next;
        }
        return head;
    }
}
