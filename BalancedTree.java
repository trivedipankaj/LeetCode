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
    public boolean isBalanced(TreeNode root) {
        int left,right;
        if(root ==null){ return true;}
        left = getHeight(root.left);
        right =getHeight(root.right);
        
        return (Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right));
        
    }
    
    public int getHeight(TreeNode root){
        if(root ==null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        return 1+ (left>right?left:right);
    }
}
