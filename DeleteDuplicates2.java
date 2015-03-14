/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null || head.next==null) return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev=dummyHead,curr=head;
        int count=0;
        while(curr!=null){
            if(prev.next.val == curr.val){
                count++;
                curr=curr.next;
            }else{
                if(count>1){
                  prev.next = curr;   
                }else{
                    prev=prev.next;
                    curr =prev.next;
                }
                count=0;
            }
        }
        if(count>1){
            prev.next=null;
        }
        return dummyHead.next;
    }
}
