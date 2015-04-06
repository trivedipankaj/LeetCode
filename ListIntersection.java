/****
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


*/


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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0; 
        int lengthB=0;
        ListNode listA = headA; ListNode listB=headB;
        while(listA!=null){
            lengthA++;
            listA =listA.next;
        }
        while(listB!=null){
            lengthB++;
            listB=listB.next;
        }
        int diff = Math.abs(lengthA-lengthB);
        listA = headA; listB=headB;
        if(lengthB> lengthA){
            listA=headB;
            listB=headA;
        }
        
        for(int i=0; i<diff; i++){
            listA =listA.next;
        }
        
        while(listA!=null && listB!=null){
            if(listA.val == listB.val){
                return listA;
            }
            listA =listA.next; listB=listB.next;
        }
        return null;
    }
}
