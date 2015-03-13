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
    int first=-1,second=-1,prev=-1;
    int temp;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        correctTree(root);
    }
    public void inOrder(TreeNode root){
        if(root !=null){
            inOrder(root.left);
            if(prev!=-1 && prev > root.val){
                 second = root.val;
                 if(first==-1){
                     first=prev;
                 }
            }
            prev =root.val;
            inOrder(root.right);
        }
    }
    
    public void correctTree(TreeNode root){
        if(root!=null){
            correctTree(root.left);
            if(root.val == first){
                root.val =second;
            }else if(root.val == second){
                root.val = first;
            }
            correctTree(root.right);
        }
    }
    
}
