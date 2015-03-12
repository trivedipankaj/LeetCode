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
    boolean found=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        sumPath(root,sum,0);
        return found;
    }
    
    public void sumPath(TreeNode root, int sum,int sumPath){
        if(root ==null){
            return;
        }
        if(root.left==null && root.right==null && root.val+sumPath==sum){
            found=true;
        }
        sumPath(root.left,sum,sumPath+root.val);
        sumPath(root.right,sum,sumPath+root.val);
    }
}
