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
    public int minDepth(TreeNode root) {
       if(root ==null) return 0;
       return getMin(root);
    }
    
    public int getMin(TreeNode root){
        int left,right;
        if(root ==null){
            return 10000;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        left = getMin(root.left);
        right = getMin(root.right);
        return 1+(left<right?left:right);
        
    }
}
