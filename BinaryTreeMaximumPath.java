/****
Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
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
    
    public int maxPathSum(TreeNode root) {
        int[] max =new int[1];
        max[0] =Integer.MIN_VALUE;
        getMax(root,max);
        return max[0];
    }
    
    public int getMax(TreeNode root,int[] max){
        if(root==null){ return 0;}
        int left=getMax(root.left,max);
        int right=getMax(root.right,max);
        int current =Math.max(root.val,Math.max(root.val+left,root.val+right));
        max[0] =Math.max(max[0],Math.max(current,root.val+left+right));
        return current;
    }
    
}
