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
    int totalSum=0;
    public int sumNumbers(TreeNode root) {
        getSum(root,0);
        return totalSum;
        
    }
    
    public void getSum(TreeNode root, int sum){
         if(root ==null){
             return;
         }
         sum = 10*sum+root.val;
         
         if(root.left==null && root.right==null){
             totalSum +=sum;
         }
         getSum(root.left,sum);
         getSum(root.right,sum);
    }
}
