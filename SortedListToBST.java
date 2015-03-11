/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if(head ==null){ return null;}
        int len = getLength(head);
        h = head;
        return convertToBST(0,len-1);
    }
    
    public TreeNode convertToBST(int start, int end){
        if(start > end) return null;
        int mid = (start+end)/2;
        TreeNode left = convertToBST(start,mid-1);
        TreeNode parent = new TreeNode(h.val);
        h = h.next;
        TreeNode right = convertToBST(mid+1,end);
        parent.left =left;
        parent.right =right;
        return parent;
    }
    
    public int getLength(ListNode head){
        if(head==null) return 0;
        ListNode temp =head;
        int count=0;
        while(temp !=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
