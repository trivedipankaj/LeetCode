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
    public boolean isSymmetric(TreeNode root) {
        if(root ==null) return true;
        return isMirror(root.left,root.right);
    }
    
    public boolean isMirror(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        return ((a.val == b.val) && isMirror(a.left,b.right) && isMirror(a.right,b.left));
    }
}
