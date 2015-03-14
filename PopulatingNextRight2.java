/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        TreeLinkNode temp;
        if(root == null){
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            int len =q.size();
            TreeLinkNode prev=null;
            for(int i=0; i<len;i++){
                temp = q.poll();
                if(prev!=null){
                    prev.next=temp;
                }
                prev =temp;
                if(temp.left !=null){
                     q.add(temp.left);
                }
                if(temp.right!=null){
                      q.add(temp.right);
                }
            }
        }
    }
}
