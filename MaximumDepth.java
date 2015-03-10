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
    public int maxDepth(TreeNode root) {
        int left,right;
        if(root ==null){
            return 0;
        }
        left = maxDepth(root.left);
        right = maxDepth(root.right);
        return 1+(left>right?left:right);
    }
    
}
